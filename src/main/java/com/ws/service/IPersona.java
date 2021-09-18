package com.ws.service;

//Solo se declaran los metodos pero no se implementan
public interface IPersona {

    void setNombre(String nombre);

    String getNombre();

    default  String nombre(){

        return "Jhonatan";
    }

}
