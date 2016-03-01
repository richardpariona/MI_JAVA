/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.service.prueba;

/**
 *
 * @author Alumno
 */
public class Prueba02 {
    
    public static void main(String[] args) {
        int notas[];
        notas = new int[5];
        
        
        //Recorido indexado
        for (int i = 0; i < notas.length; i++){
            int nota = notas[i];
            System.out.println(nota);
        }
        
        notas[3]= 600;
        //Recorido tipo coleccion
        for (int nota : notas){
            System.out.println(nota);
            
        }
         System.out.println("--------------");
         
         notas[1] = notas[3]/ 3;
         //Recorrido usando lambda
         Arrays.stream(notas).  
    }
    
}
