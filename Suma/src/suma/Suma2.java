/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma;
/**
 *
 * @author brito
 */
public class Suma2 {
    private int vUno, vDos, resultado;
    
    public Suma2(int valorUno, int valorDos) {
        this.vUno = valorUno;
        this.vDos = valorDos;
    }
    
    public void Operacion() {
        resultado = vDos + vUno;
    }
    
    public void MostrarResultado() {
        Operacion();
        System.out.println("El resultado de la suma es " + resultado);
    }
}
