package com.example.ejerciciolistas1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    EditText editText; // declaro EditText para poder escribir el sitio

    EditText pais; // declaro EditText para poder escribir el pais

    Button boton_ver_sitios; // Declaro el boton para ir al MainActivity y ver sitios

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = findViewById(R.id.edit_item);
        pais = findViewById(R.id.pais);

        boton_ver_sitios = findViewById(R.id.boton_ver_sitios);    // Le decimos a que id se refiere el boton1, en este caso es el boton
        // con id boton_ir_añadir que se usa para ir al MAinActivity y ver la lista


        //Ahora le decimos a este boton_ver_sitios  con intent que vaya al MainActivity para ver la lista con los sitios,
        boton_ver_sitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                String message = editText.getText().toString() + "\n" + pais.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("MESSAGE",message);
                setResult(2, intent);
                finish();
            }

        });

    }

    }

