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
public class Ej12Lucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un numero y voy a mostrarle los numeros anteriores a el.");
        Scanner teclado = new Scanner(System.in);
       int i = 1;
       int n =teclado.nextInt();
       do {
       System.out.println(i);
       i++;}
        while (i<n);
    }  
    }
    

