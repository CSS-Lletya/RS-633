/**
 * Copyright (c) 2012, Hadyn Richard
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy 
 * of this software and associated documentation files (the "Software"), to deal 
 * in the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL 
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN 
 * THE SOFTWARE.
 */

package com.rs.script;

import java.util.HashMap;
import java.util.Map;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by Hadyn Richard
 */
public final class GroovyScriptEnvironment {

    /**
     * The script engine manager for all the script environments.
     */
    private static final ScriptEngineManager manager = new ScriptEngineManager();

    /**
     * The collection of scripts that have been compiled.
     */
    private Map<String, CompiledScript> scripts;

    /**
     * The script engine for this environment.
     */
    private ScriptEngine engine;

    /**
     * Constructs a new {@link GroovyScriptEnvironment};
     */
    public GroovyScriptEnvironment() {
        scripts = new HashMap<>();
        engine = manager.getEngineByName("groovy");
        if(engine == null) {
            throw new NullPointerException();
        }
    }

    /**
     * Sets the context of the script environment.
     *
     * @param context   The environment context.
     */
    public void setContext(ScriptContext context) {
        engine.getBindings(javax.script.ScriptContext.GLOBAL_SCOPE).put("ctx", context);
    }

    /**
     * Evalulates a script, the script must have been previously compiled.
     *
     * @param name              The name of the script to evaluate.
     * @throws ScriptException  A script exception was thrown while evaluating the script.
     */
    public void eval(String name) throws ScriptException {
        CompiledScript compiledScript = scripts.get(name);
        if(compiledScript == null) {
            throw new RuntimeException("script does not exist");
        }
        compiledScript.eval();
    }

    /**
     * Loads a script.
     *
     * @param script            The script to load.
     * @throws ScriptException  A script exception was thrown while evaluating the script.
     */
    public void load(Script script) throws ScriptException {
        Compilable compilable = (Compilable) engine;
        CompiledScript compiledScript = compilable.compile(script.getSource());
        scripts.put(script.getName(), compiledScript);
    }

    /**
     * Evaluates a script.
     *
     * @param script            The script to evaluate.
     * @throws ScriptException  A script exception was thrown while evaluating the script.
     */
    public void eval(Script script) throws ScriptException {
        if(scripts.containsKey(script.getName())) {
            eval(script.getName());
        } else {
            Compilable compilable = (Compilable) engine;
            CompiledScript compiledScript = compilable.compile(script.getSource());
            scripts.put(script.getName(), compiledScript);
            compiledScript.eval();
        }
    }
    
    /**
     * Purges the environment.
     */
    public void purge() {
        scripts.clear();
    }
}
