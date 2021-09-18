package com.ws.model;

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
