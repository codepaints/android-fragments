package me.jatinsoni.fragments;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;

public class Color {

    private int mColor;
    private String mLabel;

    public Color(@ColorInt int color, String label) {
        this.mColor = color;
        this.mLabel = label;
    }

    public String getmLabel() {
        return mLabel;
    }

    public void setmLabel(String mLabel) {
        this.mLabel = mLabel;
    }

    public int getmColor() {
        return mColor;
    }

    public void setmColor(@ColorInt int mColor) {
        this.mColor = mColor;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
