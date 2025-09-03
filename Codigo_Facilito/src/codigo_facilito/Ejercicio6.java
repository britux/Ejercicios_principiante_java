/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_facilito;

/**
 *
 * @author brito
 * Imprimir en consola los primero diez números de la serie Fibonacci.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, suma = 1;
        
        for (int ciclo = 0; ciclo < 10; ciclo++) {
            System.out.print(num1  + " ");
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
            
        }
    }
}
