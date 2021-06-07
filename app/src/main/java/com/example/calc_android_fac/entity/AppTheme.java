package com.example.calc_android_fac.entity;

import com.example.calc_android_fac.R;

public enum AppTheme {


    DEFAULT(R.style.MyTheme, "default"),
    CUSTOM(R.style.MyTheme_dark, "custom");

    AppTheme(int resource , String key) {
        this.resource = resource;
        this.key = key;
    }

    private int resource;
    private String key;

    public int getResource() {
        return resource;
    }

    public String getKey() {
        return key;
    }
}
