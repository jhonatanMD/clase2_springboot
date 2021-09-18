package com.ws;

import com.ws.service.ICalculador;
import com.ws.service.impl.CalculadorImpl;

public class CalculadorRunner {


    public static void main(String[] args) {
        System.out.println(calculador(1,2,"-"));
    }

    public static int calculador(int num1 , int num2 , String operacion){

        ICalculador calculador = new CalculadorImpl();

        switch (operacion){

            case "+":
                return calculador.suma(num1,num2);
            case "-":
                return calculador.resta(num1,num2);
            case "x":
                return calculador.multiplicacion(num1,num2);
            case "/":
                return  calculador.division(num1,num2);
            default:
                throw new RuntimeException("ERROR AL MANDAR LA OPERACIÓN");
        }

    }











}
