package com.rs.script;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Hadyn Richard
 */
public final class Script {

    /**
     * The name of the script.
     */
    private String name;

    /**
     * The source of the script.
     */
    private Reader source;

    /**
     * Constructs a new {@link Script};
     * @param file The file of the script to create.
     * @throws IOException An I/O exception was thrown while creating the script.
     */
    public Script(File file) throws IOException {
        this(file.getCanonicalPath(), new FileReader(file));
    }

    /**
     * Constructs a new {@link Script};
     * @param name      The name of the script.
     * @param source    The source of the script.
     */
    public Script(String name, Reader source) {
        this.name = name;
        this.source = source;
    }

    /**
     * Gets the source of the script.
     *
     * @return  The source.
     */
    public Reader getSource() {
        return source;
    }

    /**
     * Gets the name of the script.
     *
     * @return  The name of the script.
     */
    public String getName() {
        return name;
    }
}