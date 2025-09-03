/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_facilito;

/**
 *
 * @author brito
Crear un arreglo cual nos permita almacenar cien números enteros.
Llenar el arreglo con números aleatorios.
Para obtener un número aleatorio en Java podemos hacer uso de la siguiente sentencia.

int numero = (int)(Math.random() * 100);
A partir del arreglo anteriormente creado.

Mostrar en consola el número mayor.
Mostrar en consola el número menor.
Mostrar en consola todos los números primos.
Mostrar en consola todos los números pares.
Mostrar en consola el arreglo de forma ascendente.
Mostrar en consola el promedio del arreglo.
Mostrar en consola la suma del primer y último elemento del arreglo.
Mostrar en consola el mensaje "Existe cien" en dado caso el arreglo almacene por los menos un cien.

 */
public class EjercicioVector {
    public static void main(String[] args) {
        int vector[] = new int [100];
        
        
        for (int i = 0; i < vector.length; i++) {
             vector[i] = (int)(Math.random() * 101);
             System.out.println(vector[i] + "");
        }
        
        int mayor = vector[0];
        int menor = vector[0];
        for (int i = 1; i < vector.length; i++) {
            
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
            
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }
        
        System.out.println("Numero mayor " + mayor + "\n");
        System.out.println("Numero menor " + menor + "\n");
        
        System.out.println("Numeros primos");
         for (int i = 0; i < vector.length; i++) {
             boolean esPrimo = true;
             
             if (vector[i] <= 1) {
                 esPrimo = false;
             } else {
                 for (int j = 2; j < vector[i]; j++) {
                     if (vector[i] % j == 0) {
                         esPrimo = false;
                         break;
                     }
                 }
             }
             if (esPrimo) {
                 System.out.print(vector[i] + " ");
             }
        }
        System.out.println("\n");
        
        System.out.println("Numeros pares");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                System.out.print(vector[i] + " ");
            }
        }
        System.out.println("\n");
        
        //promedio total del vector
        int total = 0;
        for (int i = 0; i < vector.length; i++) {
            total += vector[i];
        }
        double promedio = (double) total / vector.length;
        System.out.println("El promedio es " + promedio);
        
        
        //Suma del primer y ultimo elemento
        System.out.println("\nSuma deel primer y ultimo elemento");
        int numeroDeVector = vector.length;
        int primerElemento = vector[0], ultimoElemento = vector[numeroDeVector-1];
        int suma = primerElemento + ultimoElemento;
        System.out.println(primerElemento + " + " + ultimoElemento + " = " + suma);
        
        
        System.out.println("");
        System.out.println("Arreglo en forma ascendente");
        // metodo burbuja
        int auxiliar = 0;
        
        for (int i = 0; i < (vector.length - 1); i++) {
            for (int j = 0; j < (vector.length- 1); j++) {
                if (vector[j] > vector[j+1]) {
                    auxiliar = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = auxiliar;
                }
            }
        }
        
        //mostrar el arreglo ordenado
        for (int i = 0; i < vector.length; i++) {
            if (i < vector.length-1) {
                System.out.print(vector[i] + " - ");
            } else {
                System.out.println(vector[i]);
            }
        }
        System.out.println("");
        //Mostrar en consola el mensaje "Existe cien" 
        //en dado caso el arreglo almacene por los menos un cien.
        boolean existeCien = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 100) {
                existeCien = true;
                break;
            }
        }
        if (existeCien != true) {
            System.out.println("No existe cien");
        } else  {
            System.out.println("Existe cien");
        }
    }
}
