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
public abstract class CompAbstract {
    
    protected final double IGV = 0.18;
    protected final double SERVICE = 0.10;
    
    
    public abstract ItemDto[]procesar (double total);
    
    
}
