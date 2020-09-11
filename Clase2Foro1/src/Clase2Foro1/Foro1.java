package Clase2Foro1;
import java.util.Scanner;

public class Foro1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dimencionaremos un vector ");
        System.out.println("");
        System.out.print("Escriba el tamaño del vector: ");
        int elementos = teclado.nextInt();
        System.out.println("");
        
        int [] Vector = new int[elementos];
              
        for(int i=0;i<elementos;i++){
            
            System.out.print("ingrese valor para la posicion "+(i+1)+":");
            int datos = teclado.nextInt();
            Vector[i]=datos;
            
        }
        //----------------------------------------------------------------------
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("NO ALMACENA MULTIPLOS DE 7");
        System.out.println("");
        
        for(int i=0;i<elementos;i++){
           
            if(Vector[i]%7==0){
                System.out.println("Posisión "+(i+1)+" del Vector: - (No almacena multiplos de 7)");
            }
            else{
                System.out.println("Posisión "+(i+1)+" del Vector: "+Vector[i]);
            }
            
        }
        //----------------------------------------------------------------------   
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("ORDENADOS DE MENOR A MAYOR");
        System.out.println("");
        
       //Metodo burbuja
       
       int aux;
       
       for(int i=0; i<(elementos-1);i++){
           for(int j=0; j<(elementos-1);j++){
               if(Vector[j] > Vector[j+1]){ //Si numero actual < numero siguiente : cambio
                   aux = Vector[j];
                   Vector[j] = Vector[j+1];
                   Vector[j+1] = aux;       
               }  
           } 
       }
       //Mostrar Vector ordenado en pantalla
       
       for(int i=0; i<elementos; i++){
           System.out.println(Vector[i]);
       }    
    }
}