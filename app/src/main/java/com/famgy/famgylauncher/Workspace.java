package com.famgy.famgylauncher;

import android.app.WallpaperManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Workspace extends ViewGroup {

    private View childAt;
    private int measuredWidth;
    private int measuredHeight;

    public Workspace(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Workspace(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        childAt = getChildAt(0);
        if (null != childAt) {
            childAt.layout(0, 0, 100, 100);
        }
    }

    public void insertCellLayout() {
        CellLayout cellLayout = (CellLayout)LayoutInflater.from(getContext()).inflate(R.layout.workspace_cell_layout, this, false);

        addView(cellLayout, 0);
    }
}
