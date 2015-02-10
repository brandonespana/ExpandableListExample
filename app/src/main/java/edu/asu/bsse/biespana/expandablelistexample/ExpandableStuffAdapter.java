package edu.asu.bsse.biespana.expandablelistexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.LinkedHashMap;

/**
 * Created by biespana on 2/10/15.
 */
public class ExpandableStuffAdapter extends BaseExpandableListAdapter implements View.OnTouchListener, ExpandableListView.OnGroupExpandListener, ExpandableListView.OnGroupCollapseListener {

    private LinkedHashMap<String, String[]> model;

    public ExpandableStuffAdapter(){
        this.model = new LinkedHashMap<String, String[]>();
        this.model.put("Pets",new String[]{"Pet1","pet2","pet3"});
        this.model.put("Schools",new String[]{"s2","s2","s3"});
        this.model.put("Courses",new String[]{"Calculus","History","History"});
        this.model.put("tools",new String[]{"hammer","drill","knife"});



    }

    @Override
    public int getGroupCount() {
        String[] keyNames = this.model.keySet().toArray(new String[]{});
        return keyNames.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        String[] keyNames = this.model.keySet().toArray(new String[]{}); //array of all the keys
        String key = keyNames[groupPosition];

        return this.model.get(key).length;

    }

    @Override
    public Object getGroup(int groupPosition) {//get the name of the groupj, the category name
        String[] keyNames = this.model.keySet().toArray(new String[]{});
        String key = keyNames[groupPosition];

        return key;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        String[] keyNames = this.model.keySet().toArray(new String[]());
        String key = keyNames[groupPosition];
        String [] children = this.model.get(key);
        String child = children[childPosition];

        return child;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if(convertView==null){

            LayoutInflater inflater  = (LayoutInflater.fro)
        }
        //check if converView is null
        //if it is, create a new one and then continue with the stuff
        return null;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    @Override
    public void onGroupCollapse(int groupPosition) {

    }

    @Override
    public void onGroupExpand(int groupPosition) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
