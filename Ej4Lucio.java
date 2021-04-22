/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1lucio;

import java.util.Scanner;

/**
 *
 * @author pc08
 */
public class Ej4Lucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //armar un programa que ingrese por teclado la cantidad de hs trabajadas y el costo de las mismas y calcule el sueldo por mes y por año
        Scanner Teclado = new Scanner (System.in);
        double horas;
        double costo;
       int mes;
       int año;
       System.out.println("Ingrese las horas trabajadas y cuanto gana por hora");
       horas = Teclado.nextDouble();
      costo = Teclado.nextDouble();
      mes = 20;
      año = mes*12;
      System.out.println("Gana " + (horas*costo)*mes + " al mes");
      System.out.println("Y gana " + (horas*costo)* año + " al año");
      
      
        
    }
    
}
