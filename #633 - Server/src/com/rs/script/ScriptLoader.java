package com.rs.script;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.script.ScriptException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/**
 * Created by Hadyn Richard
 */
public final class ScriptLoader {

	/**
	 * The JSON factory to create new JSON parsers with.
	 */
	private JsonFactory factory = new JsonFactory();

	/**
	 * The ruby script environment for the plugin loader.
	 */
	private GroovyScriptEnvironment scriptEnvironment = new GroovyScriptEnvironment();

	/**
	 * The map that contains all the parsed plugin data.
	 */
	private Map<String, ScriptData> parsedPluginData = new HashMap<>();

	/**
	 * The set of plugins that have had their scripts loaded.
	 */
	private Set<String> loadedPlugins = new HashSet<>();

	private static ScriptLoader scriptLoader;

	public static void init() throws IOException, ScriptException {
		scriptLoader = new ScriptLoader();
		scriptLoader.setContext(ScriptContext.getScriptContext());
		scriptLoader.load("./data/scripts/");
	}

	public void reloadPlugins() throws IOException, ScriptException {

		/* Purge the dispatcher and script context */
		ScriptContext.getScriptContext().purge();
		purge();

		/* Reload all the plugins */
		setContext(ScriptContext.getScriptContext());
		load("./data/scripts/");
	}

	/**
	 * Constructs a new {@link ScriptLoader};
	 */
	public ScriptLoader() {
	}

	/**
	 * Sets the context for the script environment.
	 * 
	 * @param context
	 *            The context for the environment.
	 */
	public void setContext(ScriptContext context) {
		scriptEnvironment.setContext(context);
	}

	/**
	 * Loads all the plugins from the specified directory.
	 */
	public void load(String dir) throws IOException, ScriptException {
		load(new File(dir));
	}

	/**
	 * Loads all the plugins from the specified file directory.
	 */
	public void load(File dir) throws IOException, ScriptException {
		scriptEnvironment.eval(new Script(new File(dir, "bootstrap.groovy")));
		for (File file : dir.listFiles()) {

			/* Skip over non-directory files */
			if (!file.isDirectory()) {
				continue;
			}

			File dataFile = new File(file, "plugin.json");

			/* Check to see if the json data file exists */
			if (!dataFile.exists()) {
				System.out.println("missing plugin.json file from '"
						+ file.getName() + "' plugin");
				continue;
			}

			JsonParser parser = factory.createParser(dataFile);

			/* Check to see if the JSON structure start is correct */
			if (parser.nextToken() != JsonToken.START_OBJECT) {
				throw new IOException();
			}

			/* Load the plugin data from the JSON file */
			ScriptData scriptData = new ScriptData();
			while (parser.nextToken() != JsonToken.END_OBJECT) {
				String currentName = parser.getCurrentName();
				if (currentName == null)
					continue;
				switch (currentName.toLowerCase()) {
				case "scripts":
					/* Check to see if the next token is valid */
					if (parser.nextToken() != JsonToken.START_ARRAY) {
						throw new IOException();
					}

					while (parser.nextToken() != JsonToken.END_ARRAY) {
						scriptData.addScript(parser.getText());
					}
					break;

				case "dependencies":
					/* Check to see if the next token is valid */
					if (parser.nextToken() != JsonToken.START_ARRAY) {
						throw new IOException();
					}

					while (parser.nextToken() != JsonToken.END_ARRAY) {
						scriptData.addDependency(parser.getText());
					}
					break;

				case "authors":
					/* Check to see if the next token is valid */
					if (parser.nextToken() != JsonToken.START_ARRAY) {
						throw new IOException();
					}

					while (parser.nextToken() != JsonToken.END_ARRAY) {
						/* La de la */
					}
					break;
				}
			}
			parsedPluginData.put(file.getName(), scriptData);
		}

		/* Load each of the plugins from its data */
		for (Entry<String, ScriptData> entry : parsedPluginData.entrySet()) {

			/* Check if the plugin has already been loaded */
			if (loadedPlugins.contains(entry.getKey())) {
				continue;
			}

			loadPlugin(dir, entry.getKey(), entry.getValue());
		}

		System.out.println("ScriptLoader loaded " + loadedPlugins.size()
				+ " scripts...");
	}

	/**
	 * Loads a plugin from the specified root directory, name, and plugin data.
	 */
	private void loadPlugin(File dir, String name, ScriptData data)
			throws IOException, ScriptException {
		/* Check if the plugin has already been loaded */
		if (loadedPlugins.contains(name)) {
			return;
		}

		/* Load all of the dependencies first */
		for (String pluginName : data.getDependencies()) {

			/* Check if the dependency is valid */
			if (!parsedPluginData.containsKey(pluginName)) {
				continue;
			}

			loadPlugin(dir, pluginName, parsedPluginData.get(pluginName));
		}

		File scriptDir = new File(dir, name);

		/* Evaluate each of the scripts */
		for (String scriptName : data.getScripts()) {
			scriptEnvironment.eval(new Script(new File(scriptDir, scriptName)));
		}

		/* Note that the plugin has been loaded */
		loadedPlugins.add(name);
	}

	/**
	 * Purges all the internal data.
	 */
	public void purge() {
		scriptEnvironment.purge();
		parsedPluginData.clear();
		loadedPlugins.clear();
	}

	public static ScriptLoader getScriptLoader() {
		return scriptLoader;
	}

}