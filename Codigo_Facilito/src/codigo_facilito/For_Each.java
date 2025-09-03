/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_facilito;

/**
 *
 * @author brito
 */
public class For_Each {
    public static void main(String[] args) {
        
        int calificaciones [] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;
        
        for (int valorpoIndice : calificaciones) {
            suma += valorpoIndice;
        }
        
        float promedio = suma / calificaciones.length;
        System.out.println(promedio);
    }
}
