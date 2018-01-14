package com.apps.husnialhamdanii.hudaninotesapp.adapter;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.NavUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.apps.husnialhamdanii.hudaninotesapp.R;

import static com.apps.husnialhamdanii.hudaninotesapp.db.DatabaseContract.NoteColumns.DATE;
import static com.apps.husnialhamdanii.hudaninotesapp.db.DatabaseContract.NoteColumns.DESCRIPTION;
import static com.apps.husnialhamdanii.hudaninotesapp.db.DatabaseContract.NoteColumns.TITLE;
import static com.apps.husnialhamdanii.hudaninotesapp.db.DatabaseContract.getColumnString;

/**
 * Created by User on 09/01/2018.
 */

public class HudaniNotesAdapter extends CursorAdapter {

    public HudaniNotesAdapter(Context context, Cursor c, boolean autoRequery) {
        super(context, c, autoRequery);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_hudani_note, viewGroup, false);
        return view;
    }

    @Override
    public Cursor getCursor() {
        return super.getCursor();
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        if (cursor != null) {
            TextView tvTitle = (TextView) view.findViewById(R.id.tv_item_title);
            TextView tvDate = (TextView) view.findViewById(R.id.tv_item_date);
            TextView tvDescription = (TextView) view.findViewById(R.id.tv_item_description);

            tvDate.setText(getColumnString(cursor,DATE));
            tvTitle.setText(getColumnString(cursor, TITLE));
            tvDescription.setText(getColumnString(cursor, DESCRIPTION));
        }
    }
}
