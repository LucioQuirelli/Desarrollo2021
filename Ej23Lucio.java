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
public class Ej23Lucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       System.out.println("Ingrese un numero del 1 al 7 para saber que dia es");
       int dia = teclado.nextInt();
       String nomDia;
       switch (dia)
       {case 1: nomDia = "Lunes";
       break;
       case 2: nomDia ="Martes";
       break;
       case 3: nomDia = "Miercoles";
       break;
       case 4: nomDia = "Jueves";
       break;
       case 5: nomDia = "Viernes";
       break;
       case 6: nomDia = "Sabado";
       break;
       case 7: nomDia = "Domingo";
       default: nomDia = "Dia invalido";
       break;
       }
       System.out.println(nomDia);
               
    }
    
}
