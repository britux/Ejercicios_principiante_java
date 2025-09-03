/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplouno;

import java.util.Scanner;

/**
 *
 * @author Elmer Brito
 */
public class EjemploUno {

    /**
     * @param args the command line arguments
     * curso de Ernesto
     * inversor de palabras
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String cadenaNormal = "";
        String cadenaReves = "";
        int longitud = 0;
        
        System.out.println("Ingrese la cadena de texto");
        cadenaNormal = sc.nextLine();
        
        longitud = cadenaNormal.length();
        
        while (longitud != 0) {
            cadenaReves += cadenaNormal.substring(longitud -1, longitud);
            longitud--;
        }
        
        System.out.println(cadenaReves);
    }
    
}
