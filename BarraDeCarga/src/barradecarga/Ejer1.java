/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barradecarga;

import java.util.Scanner;

/**
 *
 * @author brito
 * realizar un programa que permita cargar 15 numerois en un vector y al mostrar te diga cuantas veces se ingreso el numero 3
 */
public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vector[] = new int [15];
        int cont = 0;
        
        System.out.print("Que numero quieres contar las veces que se repita en el vector? : ");
        int numContar = sc.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el vector de la posicion " + (i+1));
            vector[i] = sc.nextInt();
        }
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numContar) {
                cont ++;
            }
        }
        
        System.out.println("El numero " +  numContar + " se ingreso " + cont + " veces");
    }
}
