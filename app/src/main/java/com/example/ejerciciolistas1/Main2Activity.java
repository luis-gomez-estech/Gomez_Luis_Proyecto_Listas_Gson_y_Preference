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


    EditText editText;

    Button boton_ver_sitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = findViewById(R.id.edit_item);


        boton_ver_sitios = findViewById(R.id.boton_ver_sitios);

        boton_ver_sitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                String message = editText.getText().toString() + "\n";
                Intent intent = new Intent();
                intent.putExtra("MESSAGE",message);
                setResult(2, intent);
                finish();
            }

        });

    }

    }

