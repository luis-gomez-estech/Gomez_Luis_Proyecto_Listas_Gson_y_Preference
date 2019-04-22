package com.example.ejerciciolistas1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

//Aqui modificamos donde pone User por Sitio
public class SitiosAdaptador extends ArrayAdapter<Sitio> {
    public SitiosAdaptador(Context context, List<Sitio> objects) {
        super(context, 0, objects);
    }



    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (null == convertView) {
            convertView = inflater.inflate(
                    R.layout.list_item_sitio, // Nombre del nuevo layout
                    parent,
                    false);
        }

        TextView sitio = convertView.findViewById(R.id. sitioAñadido); // Aqui declaramos el Textview en el layout list_item_sitio
       // TextView name = convertView.findViewById(R.id.tv_name);

        Sitio item = getItem(position);
        //User item = getItem(position);

        //Glide.with(getContext()).load(item.getImage()).into(avatar);

        sitio.setText(item.getSitio());
        //name.setText(item.getName());

        //title.setText(item.getTitle());
        //company.setText(item.getCompany());

        return convertView;
    }


}
