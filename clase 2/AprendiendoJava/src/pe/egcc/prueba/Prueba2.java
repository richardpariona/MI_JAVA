/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;
import pe.egcc.model.Clase4;

/**
 *
 * @author Alumno
 */
public class Prueba2 {
    public static void main(String[] args) {
        Clase2 obj = new Clase2();
        
        System.out.println("Compatibilidad de un objeto de Clase2");
        System.out.println("Object: " + ((obj instanceof Object)? "SI" : "NO"));
        System.out.println("Clase1: " + ((Clase1 instanceof Object)? "SI" : "NO"));
        System.out.println("Clase2: " + ((Clase2 instanceof Object)? "SI" : "NO"));
        System.out.println("Clase3: " + ((Clase3 instanceof Object)? "SI" : "NO"));
        System.out.println("Clase4: " + ((Clase4 instanceof Object)? "SI" : "NO"));
    }
    
}
