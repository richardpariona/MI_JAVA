/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.service.prueba;

import pe.egcc.espec.IDemo2;
import pe.egcc.espec.IDemo3;
import pe.egcc.espec.IDemo4;
import pe.egcc.service.MateService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    
    public static void main(String[] args) {
        MateService v_m = new MateService();
        
        IDemo3 v_n = v_m;
        IDemo4 v_p = v_m;
        IDemo2 v_q = v_m;
        
        
        
    }
    
}
