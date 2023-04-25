/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3exepciones;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejer3Exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        try {
            System.out.println("Ingrese 2 numeros");
            String numero1 = leer.next();
            String numero2 = leer.next();

            int num1 = parseInt(numero1);
            int num2 = parseInt(numero2);

            double division = num1 / num2;
            System.out.println(num1 + "/" + num2 + "=" + division);

        } catch (InputMismatchException e) {
            System.out.println("ERROR FORMATO NO VALIDO");
        } catch (NumberFormatException e) {
            System.out.println("ERROR INGRESE UN NUMERO VALIDO");
        } catch (ArithmeticException e) {
            System.out.println("ERROR NO SE PUEDE DIVIDIR ENTRE 0");
        }


    }
    
}
