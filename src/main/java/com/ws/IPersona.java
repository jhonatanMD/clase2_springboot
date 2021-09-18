package com.ws;

public interface IPersona {

    void setNombre(String nombre);

    String getNombre();

    default  String nombre(){

        return "Jhonatan";
    }

}
