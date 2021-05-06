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
public class Ej25Lucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner teclado = new Scanner (System.in);
   char caracter;
   System.out.println("Ingrese un caracter y le dire si es vocal");
   caracter = teclado.next().charAt(0);
   switch (caracter){
       case 'a': System.out.println("Si es una vocal, es la A");
       break;
       case 'e': System.out.println("Si es una vocal, es la E");
       break;
       case 'i': System.out.println("Si es una vocal, es la I");
       break;
       case 'o': System.out.println("Si es una vocal, es la O");
       break;
       case 'u': System.out.println("Si es una vocal, es la U");
       default: System.out.println("El caracter no es una vocal");
   }
    }
    
}
