/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_facilito;
import java.util.Scanner;
/**
 *
 * @author brito
 * Crear un programa el cual nos permita conocer el valor de la constante e.

e =  1/0! + 1/1! + 1/2! + 1/3! + ...
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Con cuantos valores vas a calcular e?");
        int num = sc.nextInt();
        
        double e = 0.0;
        int factorial = 1;
        
        for (int i = 0; i < num; i++) {
            
            // el factorial de 0 es 1 asi que no lo calculamos
            
            if (i > 0) {
                factorial *= i;
            }
            
            e += 1.0 / factorial;
        }
        
        System.out.println(e);
    }
   
}
