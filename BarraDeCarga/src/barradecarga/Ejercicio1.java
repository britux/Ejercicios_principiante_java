/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barradecarga;
import java.util.Scanner;
/**
 *
 * @author brito
 * realizar un programa que dado por teclado un limite numerico  (por ejemplo 100) muestre todos los numeros hasta ese limite
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int limite = sc.nextInt();
        int cont = 1;
        
        for (int i = 1; i <= limite; i++) {
            System.out.print(i + " "); 
        }
        
        while (cont <= limite) {
            System.out.print(cont + " "); 
            cont++;
        }
    }
}
