/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tateti;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Tateti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner leer = new Scanner(System.in);
        String [] numeros = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        mostrar(numeros);
        
        
        boolean boleano = false;
        do {
            System.out.println("Ingrese donde quiere poner la X");
        int resp1 = leer.nextInt();
           for (int i = 0; i < 10; i++) {
             if (resp1== i) {
            numeros[i-1] = "x";
        }     
        }
         mostrar(numeros); 
         
            if (numeros[0]=="x" && numeros[1]=="x" && numeros[2]=="x" ) {
                System.out.println("fila");
                boleano=true;
            }
  
        } while (boleano==false);
        
        
      
        
       




        
    } 
 public static void mostrar(String numero[]) {
        System.out.println(numero[0] + "|" + numero[1] + "|" + numero[2]);
        System.out.println(numero[3] + "|" + numero[4] + "|" + numero[5]);
        System.out.println(numero[6] + "|" + numero[7] + "|" + numero[8]);
    }   
}

