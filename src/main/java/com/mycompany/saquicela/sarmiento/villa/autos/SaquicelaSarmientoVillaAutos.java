/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.saquicela.sarmiento.villa.autos;

import java.util.Scanner;

/**
 *
 * @author PC-08
 */
public class SaquicelaSarmientoVillaAutos {

    public static void main(String[] args) {
         var lectura = new Scanner(System.in);
        System.out.println("Ingrese dimensión "); 
        var dimension = lectura.nextInt();
        
        System.out.println("Ingrese los números del vector ");     
        var numeroVector = new int[dimension];
        
        for(int i = 0; i<dimension; i++ ){
            numeroVector[i] = lectura.nextInt();
            
        }
        System.out.println("Los números ingresados ");     
        for(int x = 0; x < dimension; x++) {
            System.out.println("numero decimal: en la posición [" + x + "] es: " + numeroVector[x]);
        }
        System.out.println("\n Hasta luego. ");
        
        
        
        
        
        //System.out.println("Hello World!");
        /*
        var lectura = new Scanner(System.in);
        var numeroInt = new int[5];

        numeroInt[0] = 7;
        numeroInt[1] = 9;
        numeroInt[2] = 4;
        numeroInt[3] = 11;
        numeroInt[4] = 3;

        var numeroDecimal = new double[5];
        var x = 0;
        
        numeroDecimal[0] = 7.5;
        numeroDecimal[1] = 9.5;
        numeroDecimal[2] = 4.5;
        numeroDecimal[3] = 11.5;
        numeroDecimal[4] = 3.5;

        for(x = 0; x < 5; x++) {
            System.out.println("numero decimal: en la posición [" + x + "] es: " + numeroDecimal[x]);
        }
        System.out.println("\n Hasta luego. ");
        
        

        /*
        var numero = 0;
        var salir = false;
        /*
       while(salir == false){
           System.out.println("Ingresar numero: ");
           numero = lectura.nextInt();
           
           if(numero <= 10){
              System.out.println("numero: " + numero);
           }else{
               salir = true;
               System.out.println("\n Hasta luego. ");
           }
       }
         */
    }
}
