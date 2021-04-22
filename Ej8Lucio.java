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
public class Ej8Lucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        
           System.out.println("Ingresar un numero entero, y voy a escribir los numeros anteriores.");
           int n = teclado.nextInt();
        for (int i=0; i<n; i++)
        System.out.println(i);
    }
    
}
