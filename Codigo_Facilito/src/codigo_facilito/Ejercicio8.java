/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_facilito;

/**
 *
 * @author brito
 * mprimir en consola todos los números múltiplos de 2. 
 * El ciclo finalizará cuando el último múltiplo sea menor a 4570
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int num = 0;
                /// Manera de hacerlo numero unoo con mas logica
        for (int i = 0; i <= 4570; i++) {
            num = 2 * i;
            
            if (num < 4570) {
                System.out.println(num);
            } else {
                break;
            }
        }
        
        // manera de hacerlo 2 simple igual de bueno
        for (int i = 0; i < 4570; i+=2) {
            System.out.println(i);
        }
    }
}
