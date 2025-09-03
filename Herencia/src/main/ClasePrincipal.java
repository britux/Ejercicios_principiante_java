/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import operaciones.ClaseHIjaResta;
import operaciones.ClaseHijaSuma;
/**
 *
 * @author brito
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        //Sumar
        ClaseHijaSuma suma = new ClaseHijaSuma();
        suma.pedirDatos();
        suma.sumar();
        suma.mostraResultado();
        
        //Restar
        ClaseHIjaResta resta = new ClaseHIjaResta();
        resta.pedirDatos();
        resta.resta();
        resta.mostraResultado();
    }
    
    
}
