/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ItemDto;

/**
 *
 * @author Alumno
 */
public class FacturaService extends CompAbstract{
    
 
  public static void main(String[] args) {
     //Variables
     double consumo, impuesto, service, totalGeneral;
     //Proceso
     consumo = total /(1 + IGV );
     impuesto = total - consumo;
     servicio = total * SERVICIO;
     totalGeneral = total + servicio;
     //Reporte
       ItemDto[] repo = {
        new ItemDto("Consumo", consumo),
        new ItemDto("Impuesto", impuesto),
        new ItemDto("Total", total),
        new ItemDto("Servicio", servicio),
        new ItemDto("Total General", totalGeneral),
    }
    
            
    }

    @Override
    public ItemDto[] procesar(double total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
