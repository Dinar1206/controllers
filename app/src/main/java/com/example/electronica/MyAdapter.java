package com.example.electronica;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Microcontrollers> data;

    public MyAdapter(Context context,ArrayList<Microcontrollers> data){
        this.context=context;
        this.data=data;
    }
    @Override
    public int getCount() { return data.size(); }

    @Override
    public Microcontrollers getItem(int position) {
        return data.get(position);
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item, null);

        TextView name = view.findViewById(R.id.name_text);
        TextView typ = view.findViewById(R.id.type);
        ImageView imageView = view.findViewById(R.id.image);

        //Button btn = view.findViewById(R.id.btn);

        final Microcontrollers product = getItem(position);
        name.setText(product.getName());
        typ.setText(product.getType());
        imageView.setImageResource(product.getImage());





        return view;
    }
}
