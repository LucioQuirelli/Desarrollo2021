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
public class Ej3Lucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner (System.in);
        //alt + enter
        String nombreAlumno;
        double evaluacion1;
        double evaluacion2;
        double notaFinal;
        System.out.println("Nombre del alumno: ");
        nombreAlumno = Teclado.nextLine();
        System.out.println("Ingrese las notas en orden");
        evaluacion1 = Teclado.nextDouble();
        evaluacion2 = Teclado.nextDouble();
        notaFinal = (evaluacion1 + evaluacion2) / 2;
        System.out.println("La nota de la primera evaluacion es: " + evaluacion1);
        System.out.println("La nota de la segunda evaluacion es: " + evaluacion2);
        System.out.println("La nota final es: " + notaFinal);
        
        
        
        
               
        
    }
    
}
