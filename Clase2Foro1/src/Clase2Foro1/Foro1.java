package Clase2Foro1;
import java.util.Arrays;
import java.util.Scanner;

public class Foro1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dimencionaremos un vector");
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
        
        Arrays.sort(Vector); //Ordena los valores del vector de menor a mayor
        
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("ORDENADOS DE MENOR A MAYOR");
        System.out.println("");
        
        for(int i=0;i<elementos;i++){
           
            if(Vector[i]%7==0){
                System.out.println("- (No almacena multiplos de 7)");
            }
            else{
                System.out.println(Vector[i]);
            }
            
        }
        
    }
}