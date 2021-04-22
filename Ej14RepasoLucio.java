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
public class Ej14RepasoLucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingrese el radio de una circunferencia y le diré la longitud y el área de la misma.");
       double radio = teclado.nextDouble();
       double longitud = radio*2*Math.PI;
       double area = Math.pow (radio, 2)*Math.PI;
       System.out.println("La longitud es: " + (float)longitud);
       System.out.println("El area es: " + (float)area);
       
       
       
       
       
       
       
       
    }
    
}
