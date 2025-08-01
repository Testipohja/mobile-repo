package com.example.myapplication3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] items;
    String[] prices;
    String[] desc;

    public ItemAdapter(Context c,String[] i, String[] p, String[] d){
        items = i;
        prices = p;
        desc = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {


        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView descTextView = (TextView) v.findViewById(R.id.descTextView);
        TextView priceTextView = (TextView) v.findViewById(R.id.priceTextView);

        String name = items[i];
        String desc2 = desc[i];
        String cost = prices[i];

        nameTextView.setText(name);
        descTextView.setText(desc2);
        priceTextView.setText(cost);
        return v;
    }
}
