/*
Este programa rellena un vector con oraciones ingresadas 
por el usuario y las muestra por pantalla
*/
package Clase2_1;

import java.util.Scanner;

public class Ejercicio1 {
    
    
    public static void main(String[] args) {
        
        String [] Vector = new String [4];
        
        Scanner teclado = new Scanner(System.in);
        
        
        for(int i=0; i<4; i++ ){
            
            System.out.print("Ingrese oración " +(i+1)+" : ");
            Vector[i] = teclado.nextLine();      
        }
        
        //Mostrar Vector
        System.out.println("------------------------------");
        System.out.println("Mostrando vector");
        System.out.println("");
        
        for(int i=0; i<4; i++ ){
            
            System.out.println(Vector[i]);
       
        }    
    }    
}
