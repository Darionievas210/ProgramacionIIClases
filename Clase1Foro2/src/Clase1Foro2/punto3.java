package Clase1Foro2;
//Esta version es muy similar a la anterior pero eh utilizado metodos Math.min, Math.max.

import java.util.Scanner; // esta libreria permite ingresar numeros del usuario por consola

public class punto3 {
  public static void main(String[] args) {

    System.out.println("Bienvenido");
    System.out.println("");
    System.out.println("Este programa muestra los numeros comprendidos entre dos numeros");
    System.out.println("");
    
    int num1, num2;
    
    for(int i=0; i<100; i++){
    System.out.println("---------------------");
    System.out.println("");
    Scanner teclado = new Scanner(System.in); // Creando un objeto Scanner
    System.out.println("Escriba un numero entero:"); //Le pide un num al usuario
    num1= teclado.nextInt(); // asigna el numero ingresado por el usuario

    System.out.println("Escriba otro numero:");
    num2= teclado.nextInt();
    
    int menor =Math.min(num1,num2);
    int mayor =Math.max(num1,num2);
    
    System.out.println ("");
    System.out.println ("Los numeros comprendidos entre "+num1+" y "+num2+" son:");
    
    for(int a=menor+1; a<mayor;a++){
		System.out.println(a);
		}
    }
  }
} 

