package com.ws;

import com.ws.model.Alumno;
import com.ws.model.Maestro;
import com.ws.model.Persona;

public class Main {


    public static void main(String[] args) {
        System.out.println("java");

        //instancear clases

        //Padre
        Persona persona = new Persona();

        //Hijos
        Alumno alumno = new Alumno();
        Maestro maestro = new Maestro();



        //Alumno
        alumno.nombre = "Juan";
        alumno.apellido = "Mallqui Diaz";
        alumno.edad = 22;


        //Maestro
        maestro.nombre = "Luis";
        maestro.apellido = "Ramirez";
        maestro.edad = 20;


        //sout
        //if(alumno.nombre != null) {
            System.out.println(alumno.nombre+" "+alumno.apellido);
        //}
        System.out.println(maestro);


        /* CONDICIONALES */
        //IF

        if(true){
            if(true){

            }

        }else if(true){

        }else if(true){

        }else{

        }

        //SWITCH

        /*
        switch (persona.nombre){

            case "Jhonatan":

                if(true){

                }
                break;
            case "Robert":
                break;
            default:
                break;
        }



         */
        /* BUCLES */

        for(int i = 0 ; i < 11 ; i++){

        }

        while(alumno == null){

        }

        do{
            int i = 0;
        }
        while (alumno == null);


        String[] array = new String[11];

        //1 .Array String -> longitud 10
        //2 .Agregar datos al array  1,2,3,4,5,6,7,8,9,10
        //3 .Recorrer el array y pintar el valor


        //array.length longitud o tamaño del array
        for (int i  = 1 ; i < array.length  ; i++){


            array[i] = i+"";//String.valueOf(i);
            System.out.println(array[i]);

        }

        System.out.println(array[5]);


        System.out.println(alumno.getNombre());
        System.out.println(alumno.nombre());


        System.out.println(maestro.nombre);
        System.out.println(maestro.nombre());

        alumno.nombre = "Zhamir";
        System.out.println("----------------------------------------------------------");


        System.out.println(alumno.nombre());
        persona.setNombre("Mark");
        System.out.println("----------------------------------------------------------");
        System.out.println(persona.nombre());



        System.out.println("----------------------------------------------------------");

        maestro.setNombre("Robert");
        System.out.println();

        alumno.setNombre("Robert"); // alumno.nombre = "Robert"
        System.out.println(alumno.getNombre());


        // Crear una interface donde existan estos metodos suma y resta
        // implementarla en una clase Calculo
        // main -> llamar esos metodos y que haga los calculos y pintar en el log






    }

}
