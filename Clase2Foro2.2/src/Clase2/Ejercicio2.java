/*
Este programa contiene 2 vectores relacionados(user y pass), que contienen valores 
predeterminados.
1. Solicita login al usuario
2. Comprueba usuario y contraseña
3. Da la bienvenida al usuario cuando el login es exitoso
4. Informa si el login falló
 */
package Clase2;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        boolean bandera= false;
        
        for(int x=0; x<10; x++){
        
        Scanner teclado = new Scanner(System.in);
        String Usuarios[]={"Daiana","Facundo","Osvaldo","Melina"};
        int Contrasena[]={1234,4321,1122,3344};
        
        System.out.println("");
        System.out.println("Ingrese Usuario: ");
        String user = teclado.nextLine();
        System.out.println("Ingrese Contraseña: ");
        int pass = teclado.nextInt();
        System.out.println("");
   
        //------------------
        for(int i=0;i<4;i++){
 
            if(user.equals(Usuarios[i]) && pass==(Contrasena[i])){
                bandera=true;
                break;
            }
            else{
                bandera=false;
            }
        }
        //----------------------------------
        
        if (bandera==true){
            System.out.println("-------------------------");
            System.out.println("INICIO DE SESIÓN EXITOSA!");
            System.out.println("-------------------------");
        }
        else if (bandera==false){
            System.out.println("----------------------------------------");
            System.out.println("ERROR, usuario y/o contraseña incorrecta");
            System.out.println("----------------------------------------");
        }
    }
}
}