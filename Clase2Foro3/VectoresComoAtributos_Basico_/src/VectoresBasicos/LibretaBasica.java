package VectoresBasicos;
import java.util.Scanner;

public class LibretaBasica {
        
        String vector[]= new String [5];
        int contador=5;
        String cartel= "(Espacios Libres = "; //Esta variable la ubico en el menu como contador
        
        public void Menu(){
            System.out.println("-----------------------------------------------");
            System.out.println("MENU                      "+cartel+contador+")");
            System.out.println("");
            System.out.println("1. Mostrar libreta");
            System.out.println("2. Agregar nombres a la libreta");
            System.out.println("3. Eliminar nombres de la libreta");
            System.out.println("4. Salir");
        }
        //Estas funciones ayudan a llevar el conteo de espacios disponibles en el vector
        public void restaEspacio(){
            this.contador--;
                if(contador<=0){
                    this.cartel="(Sin espacio = ";   
                }  
        }
        public void sumaEspacio(){
            this.contador++;  
                if(contador>0){
                    this.cartel="(Espacios Libres = ";
                }
        }
        
        //------------------------------------------------------------------------
	public void agregarAlibreta() {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Agregar nombre: ");
            String nom= teclado.nextLine();
            /*
            Levanto bandera si encuentro que el dato a ingresar 
            ya existe en el arreglo*/
            boolean bandera=false;
                for(int i = 0 ;i<vector.length; i++){

                    if(nom.equals(vector[i])){ 
                        bandera=true;
                }
                }    
            //----------------------------------------------- 
            if(bandera==true){
                System.out.println("");
                System.out.println("ESTE NOMBRE YA EXISTE EN LA LIBRETA!!!"); 
                System.out.println("");
            }/*
            Si no esta repetido procedo a ubicarlo en una posición del
            arreglo e imprimo*/
            else{
                System.out.print("Ingrese posición: ");
                int posicion= teclado.nextInt();
                this.vector[posicion-1]=nom;
                mostrarLibreta();
            }
	}
        //-----------------------------------------------
	public void mostrarLibreta() {
            
            System.out.println("");
            System.out.println("--------------------------------");
            System.out.println("Mostrando libreta");
            System.out.println("");
            
            for(int a = 0 ;a<vector.length; a++){
                if (vector[a]==null){   
                    vector[a]="";
                }
                else{
                    System.out.println((a+1)+") --> "+vector[a]);                }
            }
	}
        //-----------------------------------------------
        public void Eliminar(){
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("");
            System.out.println("1_ Eliminar por nombre?:  ");
            System.out.println("2_ Eliminar por posición?:  ");
            int op = entrada.nextInt();
            System.out.println("");
            
            if (op==1){
                Scanner entrada1 = new Scanner(System.in);
                System.out.print("Ingrese el nombre a eliminar:  ");
                String nombre = entrada1.nextLine();
                
                for (int i=0;i<this.vector.length;i++){
                    
                    //Si hay coincidencia con un elemento que ya exista en el vector lo reemplazo con "---"
                    if (nombre.equals(this.vector[i])){
                        this.vector[i]=" --- (Recientemente eliminado)"; 
                        System.out.println("");
                        System.out.println("NOMBRE ELIMINADO!");
                        break;
                    }
                    /*Esta condicional existe por la posibilidad de que quieran eliminar 
                    algun algo sin antes haber ingresado siquiera un nombre a la libreta*/
                    else if(this.vector[i]==null){
                        System.out.println("");
                        System.out.println("NO HAY ELEMENTOS EN LA LIBRETA AÚN");
                        break;
                    }
                }
            }
            //Mismas condiciones pero en vez de eliminar por nombre se elimina por posición
            if (op==2){
                Scanner entrada2 = new Scanner(System.in);
                System.out.print("Ingrese posición a eliminar:  ");
                int pos = entrada2.nextInt();
                for (int i=0;i<=vector.length;i++){
                    if (pos == i+1){
                        this.vector[i]=" --- (Recientemente eliminado)";
                        System.out.println("");
                        System.out.println("POSICIÓN ELIMINADA!");
                        break;
                    }
                    else if(this.vector[i]==null){
                        System.out.println("");
                        System.out.println("NO HAY ELEMENTOS EN LA LIBRETA AÚN");
                        break;
                    }
                    else if(this.vector[i+1].equals(" --- (Recientemente eliminado)")){
                        System.out.println("");
                        System.out.println("NO SE ENCONTRO ELEMENTO EN LA LIBRETA!");
                        break;    
                    }
                    else if(this.vector[+1].equals("")){
                        System.out.println("");
                        System.out.println("EL CAMPO DE LA LIBRETA ESTABA VACIO!");
                        break;
                }
            }
        }
}       
}
        