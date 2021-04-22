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
public class Ej10Lucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ingrese un numero y voy a contar hasta el.");
        Scanner teclado =  new Scanner(System.in);
       int i = 1;
       int n = teclado.nextInt();
       while (i<=n){
       System.out.println(i);
       i++;
       }
    }
    
}
