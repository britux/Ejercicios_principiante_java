/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barradecarga;

/**
 *
 * @author brito
 * realizar programa que muestre los numeros del 200 al 250 saltando de 2 en 2
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int num1 = 200;
        
        for (int i = 200; i <= 250; i= i+2) {
            System.out.print(i +  " ");
        }
        
        while (num1 <= 250) {
            System.out.print(num1);
            num1+=2;
        }
    }
}
