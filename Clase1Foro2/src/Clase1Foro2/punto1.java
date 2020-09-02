package Clase1Foro2;
import java.util.Scanner; // esta libreria permite ingresar numeros del usuario por consola

public class punto1{
  public static void main(String[] args) {
    System.out.println("Bienvenido");
    System.out.println("");
    System.out.println("Este programa realiza la suma de dos numeros");
    System.out.println("");

    int x, y, suma;

    Scanner objeto = new Scanner(System.in); // Creando un objeto Scanner
    System.out.println("Escriba un numero:"); //Le pide un num al usuario
    x = objeto.nextInt(); // asigna el numero ingresado por el usuario

    System.out.println("Escriba otro numero:");
    y = objeto.nextInt();
    
    suma = x + y;  // Calcula la suma de x + y
    
    System.out.println("El resultado de la suma es: " + suma); // muestra la suma
  }
}