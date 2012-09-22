package com.beartronics.jschema;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Stage
{
    public ArrayList<Schema> schemas = new ArrayList<Schema>();
    public ArrayList<Action> actions = new ArrayList<Action>();
    public ArrayList<Item> items     = new ArrayList<Item>();

    int nitems = 10;
    int nactions = 10;
    int nschemas = 10;

    public Stage() {

    }

    public void initWorld(int n) {
        System.out.println("initializing world "+ this);
    }

    public String toString() {
        return String.format("{{ stage %s: nitems=%d nactions=%d nschemas=%d }}", this.hashCode(), nitems,nactions,nschemas);
    }

}
