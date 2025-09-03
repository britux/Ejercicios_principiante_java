/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_facilito;

/**
 *
 * @author brito
 */
public class Metodos_para_cadenas {
    public static void main(String[] args) {
        // contar cuanto texto tiene una cadena
        String texto = "Linux es GOOD";
        // metodo replace para la cantidad de caracteres sin espacios
        int cantida = texto.replace(" ", "").length();
        System.out.println(cantida);
        
        // para verificar si nuestro texto contiene una palabra en especifico
        //el metodo toUpperCase hace que la comparacion sea insensible a mayusculas y minusculas
        boolean contiene = texto.toUpperCase().contains("linux".toUpperCase());
        System.out.println(contiene);
        
        //Saber si tu texto empieza o termina con una palabra en especifico
        boolean comienzaCon = texto.toUpperCase().startsWith("linux".toUpperCase());
        boolean terminaCon = texto.toUpperCase().endsWith("good".toUpperCase());
        
        System.out.println(comienzaCon);
        System.out.println(terminaCon);
        
        //concatenar mas texto 
        String nuevoTexto = texto.concat(" y GNU tambieen!!");
        System.out.println(nuevoTexto);
    }
}
