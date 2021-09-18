package com.ws.service.impl;

import com.ws.service.ICalculador;

public class CalculadorImpl implements ICalculador {


    @Override
    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int resta(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int division(int num1, int num2) {
        return num1 / num2;
    }
}
