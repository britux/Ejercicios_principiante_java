/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author brito
 */
public class Main {
    public static void main(String[] args) {
        //Pa la suma
        OperacionesClasePadre mensajeroSuma = new ClaseSumaHija();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Operaciones();
        mensajeroSuma.Resultado();
        
        //pa la resta
        OperacionesClasePadre mensajeroResta = new ClaseRestaHija();
        mensajeroResta.PedirDatos();
        mensajeroResta.Operaciones();
        mensajeroResta.Resultado();
    }
}
