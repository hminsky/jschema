package com.beartronics.jschema;

import gnu.trove.list.TIntList;
import gnu.trove.list.array.TIntArrayList;

import java.util.Iterator;
import java.util.List;

public class Schema {
    
    // How do we handle 'override' ? An item in some state in the extended context is causing the schema
    // to be unreliable. How do we detect that?


    TIntArrayList posContext = new TIntArrayList();
    TIntArrayList negContext = new TIntArrayList();
    TIntArrayList posResult  = new TIntArrayList();
    TIntArrayList negResult  = new TIntArrayList();

    // reliability statistics
    int succeededWithActivation   = 0;
    int failedWithActivation      = 0; // number of times activation failed
    int succededWithoutActivation = 0;

    boolean applicable = false;
    float value = 0;
    // See pp. 55
    // correlation, reliability, duration, cost

    // Extended Context counters
    TIntArrayList XCposTransitionWithAction = new TIntArrayList();
    TIntArrayList XCposTransitionWithoutAction = new TIntArrayList();

    TIntArrayList XCnegTransitionWithAction = new TIntArrayList();
    TIntArrayList XCnegTranstitionWithoutAction = new TIntArrayList();

    TIntArrayList XCremainPosWithAction = new TIntArrayList();
    TIntArrayList XCremainPosWithoutAction = new TIntArrayList();

    TIntArrayList XCremainNegWithAction = new TIntArrayList();
    TIntArrayList XCremainNegWithoutAction = new TIntArrayList();

    // Extended Result counters
    TIntArrayList XRposTransitionWithAction = new TIntArrayList();
    TIntArrayList XRposTransitionWithoutAction = new TIntArrayList();

    TIntArrayList XRnegTransitionWithAction = new TIntArrayList();
    TIntArrayList XRnegTranstitionWithoutAction = new TIntArrayList();

    TIntArrayList XRremainPosWithAction = new TIntArrayList();
    TIntArrayList XRremainPosWithoutAction = new TIntArrayList();

    TIntArrayList XRremainNegWithAction = new TIntArrayList();
    TIntArrayList XRremainNegWithoutAction = new TIntArrayList();

    // Override items;
    // if val == 1, overrides from item positive val
    // if val == -1, overrides with item negative val
    TIntArrayList XOverride = new TIntArrayList();    


    Action action = null;

    public Schema(Action action) {
        this.action = action;
    }

    public String toString() {
        return "[Schema %s::%~s/ action %s/ %s::~%s]".format(posContext.toString(), negContext.toString(), action, posResult.toString(), negResult.toString());
    }


}
