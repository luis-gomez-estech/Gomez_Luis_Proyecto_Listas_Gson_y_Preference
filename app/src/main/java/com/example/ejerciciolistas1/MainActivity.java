package com.example.ejerciciolistas1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    Sitios sitiosGuardados;
    Button toJsonBtn;


    private ListView milista; // declaro la lista

    ArrayAdapter<Sitio> sitiosAdapter;

    Button btnActivity2;

    // Añadimos un SharedPreferences,
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prefs = getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);

        String name = prefs.getString("names","Name");

        sitiosGuardados = new Sitios();

        milista= findViewById(R.id.lista_final);

        if (!name.equals("Name")){
            sitiosGuardados = new Sitios(sitiosGuardados.fromJSON(name).getSitiosArray());
        }

        sitiosAdapter = new SitiosAdaptador(this, sitiosGuardados.getSitiosArray());

        milista.setAdapter(sitiosAdapter);


        toJsonBtn = findViewById(R.id.toJSON);


        toJsonBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String innerJson = sitiosGuardados.toJSON();
                Log.i("gsonExample", innerJson);

            }
        });



        btnActivity2 = findViewById(R.id.boton_ir_añadir);

        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivityForResult(intent, 2);
            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 2) {
            String message = data.getStringExtra("MESSAGE");

            sitiosGuardados.addSitio(new Sitio(message));

            sitiosAdapter.notifyDataSetChanged();

            SharedPreferences.Editor editor = prefs.edit();


            editor.putString("names", sitiosGuardados.toJSON());
            editor.apply();


        }

    }

}


