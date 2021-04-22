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
public class Ej13RepasoLucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingrese una velocidad en Km/h, y se la pasare a M/s");
       float Velocidad = teclado.nextFloat();
       float metros = Velocidad / 3.6f;
       System.out.println(metros + " m/s");
       
       
       
       
       
       
       
       
    }
    
}
