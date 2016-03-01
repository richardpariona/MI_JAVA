/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.service.prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alumno
 */
public class Prueba08 {


    public static void main(String[] args) {
        Map<String,Object> datos = new HashMap<>();
        
        datos.put("001","Gustavo");
        datos.put("002","Laura");
        datos.put("003","Hugo");
        datos.put("004","Laura");
        datos.put("005","Andrea");
        
        for (String key : datos.keySet()){
            System.out.println(key + "" + dATOS);
        }
    }
    
}
