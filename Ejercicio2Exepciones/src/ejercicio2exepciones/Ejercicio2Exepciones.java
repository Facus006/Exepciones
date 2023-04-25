/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2exepciones;

/**
 *
 * @author Facu
 */
public class Ejercicio2Exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector [] = {1,5,6};
        try {
            System.out.println("El indice "+ vector[3]);
            
        } catch (ArrayIndexOutOfBoundsException x) {
            System.out.println("EL indice esta fuera de rango");
        }
        
         try {
            System.out.println("El indice es "+ vector[2]);
            
        } catch (Exception x) {
            System.out.println("EL indice esta fuera de rango");
        }
        
        
        
        
    }
    
}
