/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5exepciones;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejer5Exepciones {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // TODO code application logic here
       
        
        Scanner leer = new Scanner(System.in);
        int numcompu = (int) (Math.random()*500+1);
        System.out.println(numcompu);
        int cont = 0;
       
        boolean acierto=false;
        System.out.println("ADIVINE EL NUMERO");
 
        do {
            try {
               String num1 = leer.next();
                int numUsuario = parseInt(num1);
                
            if (numUsuario != numcompu) {
                cont++;
                System.out.println("Incorrecto, intento " + cont + ".");
                if (numUsuario > numcompu) {
                    System.out.println(numUsuario + " es mayor que el numero que intentas adivinar.");
                }
                if (numUsuario < numcompu) {
                    System.out.println(numUsuario + " es menor que el numero que intentas adivinar.");
                }

            }
            if (numUsuario == numcompu) {
                System.out.println(" ");
                System.out.println("CORRECTO " + numUsuario + " ERA EL NUMERO SECRETO");
                System.out.println("Tuviste "+cont+" intentos.");
                acierto=true;
            }
            
            } catch (NumberFormatException e) {
                String ANSI_RED = "\u001B[31m";
                
                
                System.out.println(ANSI_RED + "ERROR VALOR INGRESADO ES INCORRECTO.");
                
            }
       
        } while (!acierto);

    }
    
}
