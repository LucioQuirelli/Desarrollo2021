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
public class Ej22Lucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      System.out.println("Ingrese un numero y le mostraré los múltiplos de 6 que hay hasta llegar al mismo.");
      int num = teclado.nextInt();
      int i = 1;
      do{
           if (i % 6 == 0){
               System.out.println(i); 
           }
               i++;
       } while (i <= num);
    }
    
}
