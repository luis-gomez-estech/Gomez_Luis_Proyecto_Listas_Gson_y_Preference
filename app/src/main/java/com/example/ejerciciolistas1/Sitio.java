package com.example.ejerciciolistas1;

public class Sitio { //Aqui le he borrado la palabra public

    //Creo la variable del atributo del sitio que guardamos
    private String sitio;



    // Creamos constructor
    public Sitio(String sitio) {
        this.sitio = sitio;
    }

    // Ahora los getter and setter
    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    // El toString
        @Override
    public String toString() {
        return "Sitio{" +
                "sitio='" + sitio + '\'' +
                '}';
    }
}
