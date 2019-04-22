package com.example.ejerciciolistas1;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Sitios {

    // Por un lado, en este proyecto teniamos creado en el MainActivity un arrayList
    // llamado sitios, pero como ahora voy a crear esta class llamada Sitios, pues para no confundirla,
    // el array se va a llamar sitiosArray y creamos en esta clase el arrayList e implantamos Gson para guardar un json con el arraylist en forma de String
    // Para usar Gson hay que implementarlo en el gradle con, implementation 'com.google.code.gson:gson:2.8.5'

    private ArrayList<Sitio> sitiosArray;

    public Sitios() {
        this.sitiosArray = new ArrayList<>();
    }

    public ArrayList<Sitio> getSitiosArray() {
        return sitiosArray;
    }
    // creamos el metodo toJSON para que cree el json
    public String toJSON(){
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }

    public Sitios fromJSON(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Sitios.class);
    }

    // Metodo para añadir el sitio introducido en Sitio, el cual con este metodo añade ese sitio nuevi al arrayList
    public void addSitio(Sitio sitio) {
        sitiosArray.add(sitio);
    }

    public void removeSitio(Sitio sitio) {
        sitiosArray.remove(sitio);
    }


    // El toString
    @Override
    public String toString() {
        return "Sitios{" +
                "sitiosArray=" + sitiosArray +
                '}';
    }
}
