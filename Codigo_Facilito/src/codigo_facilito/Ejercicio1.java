/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_facilito;
import java.util.Scanner;
/**
 *
 * @author brito
 * Mostrar en consola el mensaje de "Aprobado" en caso la calificación 
 * de un alumno sea mayor igual a 70, en caso contrario mostrar el mensaje
 * "Reprobado".
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nota");
        int nota = sc.nextInt();
        
        if (nota >= 70 && nota <= 100) {
            System.out.println("Aprobado");
        } else if (nota < 70 && nota >= 0) {
            System.out.println("Reprobado");
        } else {
            System.out.println("Ingrese su nota correcta!");
        }
    }
}
