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
public class Ej6Lucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero entero");
        num = teclado.nextInt();
        if(num%10==0)
            System.out.println("Es multiplo de 10");
        else
            System.out.println("No es multiplo de 10");
        
    }
    
}
