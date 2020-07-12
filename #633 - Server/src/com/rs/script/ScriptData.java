package com.rs.script;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Hadyn Richard
 */
public final class ScriptData {

    /**
     * The list of scripts for the plugin.
     */
    private List<String> scripts = new LinkedList<>();

    /**
     * The list of dependencies for the plugin.
     */
    private List<String> dependencies = new LinkedList<>();

    /**
     * Constructs a new {@link ScriptData};
     */
    public ScriptData() {}

    /**
     * Adds a script to the scripts list.
     * @param file The name of the script.
     */
    public void addScript(String file) {
        scripts.add(file);
    }

    /**
     * Adds a dependency to the dependency list.
     * @param dependency The name of the dependency.
     */
    public void addDependency(String dependency) {
        dependencies.add(dependency);
    }

    /**
     * Gets the list of scripts.
     * @return The scripts.
     */
    public List<String> getScripts() {
        return scripts;
    }

    /**
     * Gets the list of plugin dependencies.
     * @return The plugin dependencies.
     */
    public List<String> getDependencies() {
        return dependencies;
    }
}