/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author brito
 */
public class LLFunciones {
     private int kilos = 0, llenadoCompleto = 0, tipoRopa = 0, lavadoCompleto = 0, secadoCompleto = 0;

    public LLFunciones(int kilos, int tipoRopa) {
        this.kilos = kilos;
        this.tipoRopa = tipoRopa;
    }
    
    // con este metodo llenas la lavadora y el maximo es de 12 kg
    private void Llenado() {
        if (kilos <= 12 && kilos >= 1) {
            llenadoCompleto = 1;
            System.out.println("llenando...");
            System.out.println("LLenado completo");
        } else {
            System.out.println("Tienes demasiada ropa, reduce la carga");
        }
    }
    
    // este metodo lava la ropa verificando que este llenada la lavadora
    private void Lavado() {
        Llenado();
        if (llenadoCompleto != 1) {
            System.out.println("No se puede lavar la lavadora no tiene ropa");
            
        } else {
            
            switch (tipoRopa) {
                case 1:
                    lavadoCompleto = 1;
                    System.out.println("Ropa Blanca Lavado con lejia");
                    System.out.println("Lavando...");
                    System.out.println("Ropa Blanca lavada");
                    break;
                case 2:
                    lavadoCompleto = 1;
                    System.out.println("Ropa de color Lavado sin lejia");
                    System.out.println("Lavando...");
                    System.out.println("Ropa de color lavada");
                    break;
                default:
                    System.out.println("El tipo de ropa No existe!!! Vuelve a intentarlo");
                    break;
            }
        }
    }
    
    // este metodo Seca la ropa verificando que este lavada
    private void Secado() {
        Lavado();
        
        if (lavadoCompleto != 1) {
            System.out.println("No se puede secar! No hay ropa lavada!");
            
        } else  {
            secadoCompleto = 1;
            System.out.println("Secando...");
            System.out.println("Ropa Secada");
        }
    }
    
    // Este metodod indica que la ropa ya esta lista
    public void CicloFinalizado() {
        Secado();
        if (secadoCompleto != 1) {
            System.out.println("La ropa no esta lista no esta secada");
        } else {
            System.out.println("Tu ropa esta completamente Lista!");
        }
        
    }
    
    // getter and setter
    
    public int getTipoRopa() {
        return tipoRopa;
    }
    
    public void setTipoRopa(int tipoRopa) {
        this.tipoRopa = tipoRopa;
    }
    
}
