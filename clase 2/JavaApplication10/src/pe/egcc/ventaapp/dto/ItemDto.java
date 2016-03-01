/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.ventaapp.dto;

/**
 *
 * @author Alumno
 */
public class ItemDto {
    private String concepto;
    private double valor;
    
    public ItemDto(){
        
    }
    public ItemDto(String concepto,double valor){
        this.concepto = concepto;
        this.valor = valor;
    }
}

