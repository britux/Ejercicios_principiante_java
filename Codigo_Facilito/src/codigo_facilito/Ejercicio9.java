/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author brito
 * Dado un número entero obtener su factorial.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el numero que quieres sacar factorial!");
        int numFactorial = sc.nextInt();
        int sumatorio = 1;
        
        for (int i = numFactorial; i > 1; i--) {
            sumatorio = sumatorio * i;
        }
        
        System.out.println(sumatorio);
    }
}
