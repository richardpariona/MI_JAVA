/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.ventaapp.service;

/**
 *
 * @author Alumno
 */
public class CompFactory {
    
    private CompFactory(){
    }
    
    public static final String COMP_FACTURA = "FACTURA";
    public static final String COMP_BOLETA = "BOLETA";
    
    public static CompAbstract obtenerComp(String tipo){
        CompAbstract comp = null;
        switch(tipo){
            case COMP_FACTURA:
                comp = new BoletaService();
                break;
        }
        return comp;
        
    }
            
    
}
