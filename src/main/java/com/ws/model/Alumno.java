package com.ws.model;

//Las clases se extienden
public class Alumno extends Persona {

    //nombre
    //apellido
    //edad


    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
