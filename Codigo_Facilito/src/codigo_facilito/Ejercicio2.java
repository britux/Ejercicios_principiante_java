/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_facilito;
import java.util.Scanner;
/**
 *
 * @author brito 
 * Dado 3 números enteros, mostrar en consola
 * los números de forma ascendente, de menor a mayor.
 * Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50
 * 
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el numero 1: ");
        int a = sc.nextInt();
        System.out.println("Ingresa el numero 2: ");
        int b = sc.nextInt();
        System.out.println("Ingresa el numero 3: ");
        int c = sc.nextInt();
        int menor, medio, mayor;
        
        
        if (a <= b && a <= c) {
            menor = a;
            
            if (b <= c) {
                medio = b;
                mayor = c;
            } else {
                medio = c;
                mayor = b;
            }
            System.out.println(menor + ", "+ medio + ", " + mayor);
            
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                medio = a;
                mayor = c;
            } else {
                medio = c;
                mayor = a;
            }
            System.out.println(menor + ", "+ medio + ", " + mayor);
            
        } else if (c <= a && c <= b) {
            menor = c;
            if (a <= b) {
                medio = a;
                mayor = b;
            } else {
                medio = b;
                mayor = a;
            }
            System.out.println(menor + ", "+ medio + ", " + mayor);
        }
        
        
    }
}
