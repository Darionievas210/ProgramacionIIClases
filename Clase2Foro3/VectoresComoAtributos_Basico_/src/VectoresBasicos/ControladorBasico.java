package VectoresBasicos;
import java.util.Scanner;

public class ControladorBasico {

    public static void main(String[] args) {
        LibretaBasica miLibreta = new LibretaBasica();
        Scanner entrada = new Scanner(System.in);
        
        //Bucle hasta que opcion sea igual a 4
        for (int i=0; i<100; i++){
            miLibreta.Menu();
            
            System.out.println("");
            System.out.println("Elija una opcion");
            int op = entrada.nextInt();
            
            if (op==1){
                miLibreta.mostrarLibreta();        
            }
            if (op==2){
                miLibreta.agregarAlibreta();
                
                    //Si contador sigue siendo mayor a 0, la funcion restaEspacio() resta en 1 el contador
                    if(miLibreta.contador>0){
                        miLibreta.restaEspacio();                 
                    }
            }
            if (op==3){
                miLibreta.Eliminar();
                
                    //Si contador sigue siendo menor al largo del vector, funcion sumaEspacio() agrega 1 al contador
                    if(miLibreta.contador < miLibreta.vector.length){
                        miLibreta.sumaEspacio(); 
                    }
            }
            if (op==4){
                break;
            }
        }
    }
}
