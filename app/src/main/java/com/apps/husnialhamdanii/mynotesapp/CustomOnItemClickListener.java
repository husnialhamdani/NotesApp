package com.apps.husnialhamdanii.mynotesapp;

import android.view.View;

/**
 * Created by User on 05/01/2018.
 */

public class CustomOnItemClickListener implements View.OnClickListener {

    private int positon;
    private OnItemClickCallback onItemClickCallback;

    public CustomOnItemClickListener(int positon, OnItemClickCallback onItemClickCallback) {
        this.positon = positon;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, positon);
    }

    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }
}
