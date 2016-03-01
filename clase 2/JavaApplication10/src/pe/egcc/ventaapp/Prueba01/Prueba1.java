/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.ventaapp.Prueba01;

import pe.egcc.ventaapp.dto.ItemDto;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

/**
 *
 * @author Alumno
 */
public class Prueba1 {
    public static void main(String[] args) {
        //Datos
        double total = 567.34;
        //Proceso
        CompAbstract comp = new FacturaService();
        ItemDto[] repo = comp.procesar(total);
        //Reporte
        for (ItemDto dto : repo){
            System.out.println("dto.getConcepto");
            
        }
                
        
    }
    
}
