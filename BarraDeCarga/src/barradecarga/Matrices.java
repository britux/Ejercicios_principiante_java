/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barradecarga;

import java.util.Scanner;

/**
 *
 * @author brito
 */
public class Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int matriz [] [] = new int [3] [3]; 
        
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.println("Ingresa el valor de la matriz " + "[" + f + "]"  + "[" + c + "]");
                matriz[f][c] = sc.nextInt();
            }
        }
        
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.println("El valor ingresado en la matriz  " + "[" + f + "]"  + "[" + c + "]");
                System.out.println("Es " + matriz[f][c]);
            }
        }
    }
}
