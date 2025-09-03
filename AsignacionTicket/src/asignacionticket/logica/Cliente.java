/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignacionticket.logica;

import java.util.List;

/**
 *
 * @author brito
 */
public class Cliente {
    private int id;
    private String dui;
    private String nombre;
    private String apellido;
    private List<Ticket> listaTickets;

    public Cliente() {
        this.listaTickets = new java.util.ArrayList<>();
    }

    public Cliente(int id, String dui, String nombre, String apellido, List<Ticket> listaTickets) {
        this.id = id;
        this.dui = dui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaTickets = listaTickets;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Ticket> getListaTickets() {
        return listaTickets;
    }

    public void setListaTickets(List<Ticket> listaTickets) {
        this.listaTickets = listaTickets;
    }
    
    
    
}
