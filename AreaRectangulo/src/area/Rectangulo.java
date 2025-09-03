/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area;

/**
 *
 * @author brito
 */
public class Rectangulo {
    
    private int base, altura, area;
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void CalcularArea() {
        area = base * altura;
    }
    
    public void MostrarResultado() {
        CalcularArea();
        System.out.println("La area es " + area);
    }
    
}
