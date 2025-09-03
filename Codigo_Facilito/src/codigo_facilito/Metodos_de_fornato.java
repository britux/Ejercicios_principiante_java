/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_facilito;

/**
 *
 * @author brito
 */
public class Metodos_de_fornato {
    public static void main(String[] args) {
        
        //MOSTRAR TODO EN MAYUSCULAS
        String texto = " que pasa tio ";
        System.out.println(texto.toUpperCase());
        
        //mostrar todo en minusculas
        System.out.println(texto.toLowerCase());
        
        //remover espacio y de inicio del texto
        System.out.println(texto.toUpperCase().trim());
        
        // Usando format podes dar argumento
        String curso = "Java";
        String bienvenida = "Bienvenido a este curso de ";
        String mensaje = String.format("Bienvenido al curso de %s", curso);
        System.out.println(mensaje);
        mensaje = String.format(bienvenida + curso);
        System.out.println(mensaje);
        
        //Con format poner argumento para cuantos numeros queres mostrar
        float valor = 4.50136f;
        System.out.printf("El total de %d articulos es %.2f %s ",4, valor, "Dolares");
        
        mensaje = String.format("\nEl total de %d articulos es %f %s",4, valor, "Dolares");
        System.out.println(mensaje);
        
    }
}
