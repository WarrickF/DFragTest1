package app.com.victorioussolutions.dfragtest1;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import app.com.victorioussolutions.dfragtest1.dummy.DummyContent;

/**
 * Created by Warrick on 8/29/2015.
 */
public class ContentAdapter extends ArrayAdapter<DummyContent.DummyItem> {
    public ContentAdapter(Context context, int resource) {
        super(context, resource);
    }

    public ContentAdapter(Context context, int resource, int textViewResourceId, List<DummyContent.DummyItem> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    private LayoutInflater mInflater;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return super.getView(position, convertView, parent);
        //return LayoutInflater.from(getContext()).inflate(R.layout.fancy_activity_list_item, parent, false);
    }
}
