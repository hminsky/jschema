package com.beartronics.jschema;

import java.util.Iterator;
import java.util.List;

public class Input {
    String name;
    float  value;
    int    index;
    InputType type;

    public static enum InputType {
        PRIMITIVE, SYNTHETIC
    }


    Input(String name, int index, float value, InputType type) {
        this.name = name;
        this.index = index;
        this.value = value;
        this.type = type;
    }

    Input(String name, int index, float value) {
        this.name = name;
        this.index = index;
        this.value = value;
        this.type = InputType.PRIMITIVE;
    }

    public String toString() {
        return "[Input"+index+" "+name+": "+value+"]";
    }

}
