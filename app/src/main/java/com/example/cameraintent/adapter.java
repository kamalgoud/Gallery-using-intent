package com.example.cameraintent;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class adapter extends ArrayAdapter {

    public adapter(@NonNull Context context, ArrayList<datamodel> datalist) {
        super(context, 0,datalist);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View current=convertView;
        if(current==null){
            current= LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
        }
        datamodel datamodel= (com.example.cameraintent.datamodel) getItem(position);
        ImageView imageView=current.findViewById(R.id.gimg);
        TextView textView=current.findViewById(R.id.gtv);
        imageView.setImageBitmap(datamodel.getId());
        textView.setText(datamodel.getT());

        return current;
    }
}
