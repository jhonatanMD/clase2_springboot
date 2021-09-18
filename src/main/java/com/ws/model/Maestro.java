package com.ws.model;

public class Maestro extends Persona{

    //nombre
    //apellido
    //edad




    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Maestro{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
