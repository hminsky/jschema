package com.beartronics.jschema;

import java.io.InputStream;
import junit.framework.TestCase;

public class SchemaTest extends TestCase {

    public SchemaTest(String name) {
        super(name);
    }

    public void testCreate() throws Exception {
        Schema s = new Schema(null);
        s.id = 259;
        assertEquals( 259 , s.id );
    }
}
