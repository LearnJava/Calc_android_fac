package com.example.calc_android_fac.entity;

import android.content.Context;
import android.content.SharedPreferences;

public class ThemeStorage {

    private final static String KEY_APP_THEME = "KEY_APP_THEME";
    boolean isDarkTheme = false;
    SharedPreferences sharedPreferences;

    public ThemeStorage(Context context) {
        sharedPreferences = context.getSharedPreferences("app_themes", Context.MODE_PRIVATE);
    }


    public AppTheme getTheme() {
        String key = sharedPreferences.getString(KEY_APP_THEME, AppTheme.DEFAULT.getKey());

        for (AppTheme theme: AppTheme.values()) {
            if (theme.getKey().equals(key)) {
                if (key.equalsIgnoreCase("custom")) {
                    isDarkTheme = true;
                } else if (key.equalsIgnoreCase("default")) {
                    isDarkTheme = false;
                }
                return theme;
            }
        }

        throw new IllegalStateException("Wrong !!!");
    }

    public void setTheme(AppTheme theme) {
        sharedPreferences.edit().putString(KEY_APP_THEME, theme.getKey()).apply();
    }

    public boolean isDarkTheme() {
        return isDarkTheme;
    }

}
