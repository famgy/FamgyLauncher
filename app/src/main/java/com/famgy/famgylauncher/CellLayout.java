package com.famgy.famgylauncher;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class CellLayout extends ViewGroup {

    private View childAt;
    private int measuredWidth;
    private int measuredHeight;

    public CellLayout(Context context) {
        this(context, null);
    }

    public CellLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CellLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        childAt = getChildAt(0);
        if (null != childAt) {
            childAt.layout(0, 0, 100, 100);
        }
    }
}
