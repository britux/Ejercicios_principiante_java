package codigo_facilito;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author brito
 */
public class Whilee {
    public static void main(String[] args) {
         // saber cuantos digitos tiene un numero
         
         int numero = 123456789;
         int contador = 0;
         int num = numero;
         
         while (numero > 0) {
             numero /= 10;
             contador++;
        }
         System.out.println("El numero " + num + " posee " + contador + " digitos");
    }
}
