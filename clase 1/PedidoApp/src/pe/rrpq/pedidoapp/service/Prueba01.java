/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.rrpq.pedidoapp.service;

/**
 *
 * @author Alumno
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Dato
        double importe = 7890.0;
        //Proceso
        PedidoService service = new PedidoService(); 
        double impuesto = service.calcularImpuesto(importe);
        double total = service.calcularTotal(importe);
        //Reporte
        System.out.println("Importe: " + importe); 
        System.out.println("Importe: " + impuesto);
        System.out.println("Importe: " + total);
        
        
              
     
    }
    
}
