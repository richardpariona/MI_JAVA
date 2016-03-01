/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.service.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *Lista tipificada
 * @author Alumno
 */
public class Prueba07 {
    
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Gustavo");
        lista.add("Hugo");
        lista.add("Ricardo");
        lista.add("Marcelo");
        
        for (String nombre : lista){
            System.out.println("nombre");
        }
    }
    
}
