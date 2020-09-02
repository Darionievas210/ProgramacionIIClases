
package Clase1Foro3;

public class Principal {

    public static void main(String[] args) {
        Persona dario =new Persona();
        
        dario.setNombre("Dario");
        dario.setApellido("Nievas");
        
        System.out.println("Primera persona registrada: "+dario.getNombre()+" "+dario.getApellido());
        
    }
    
}
