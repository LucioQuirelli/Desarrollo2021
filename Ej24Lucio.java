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
public class Ej24Lucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
       System.out.println("Ingrese un numero del 1 al 12 para saber que mes es");
       int mes = teclado.nextInt();
       String nomMes;
       switch (mes)
       {case 1: nomMes = "Enero";
       break;
       case 2: nomMes = "Febrero";
       break;
       case 3: nomMes = "Marzo";
       break;
       case 4: nomMes = "Abril";
       break;
       case 5: nomMes = "Mayo";
       break;
       case 6: nomMes = "Junio";
       break;
       case 7: nomMes = "Julio";
       break;
       case 8: nomMes = "Agosto";
       break;
       case 9: nomMes = "Septiembre";
       break;
       case 10: nomMes = "Octubre";
       break;
       case 11: nomMes = "Noviembre";
       break;
       case 12: nomMes = "Diciembre";
       default: nomMes = "Mes invalido";
       break;
       }
       System.out.println(nomMes);
               
    }
    }
    

