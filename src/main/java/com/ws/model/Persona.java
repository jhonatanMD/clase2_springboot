package com.ws.model;

import com.ws.service.IPersona;

//Clase Padre
//Las Interfaces se implementan
//Las Clases se extientien
public class Persona implements IPersona {

    public String nombre;
    public String apellido;
    public int edad;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String nombre() {
        return IPersona.super.nombre();
    }
}
