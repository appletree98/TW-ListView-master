package com.myapplicationdev.android.tw_listview;

/**
 * Created by 15017519 on 28/4/2017.
 */

public class Module {
    private String name;
    private boolean isProgramming;
    public Module(String name, boolean isProgramming) {
        this.name = name;
        this.isProgramming = isProgramming;
    }
    public String getName() {
        return name;
    }
    public boolean isProgramming() {
        return isProgramming;
    }
}