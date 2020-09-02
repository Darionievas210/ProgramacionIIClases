
package Clase1Foro3;


public class Ciudadano extends Persona{
    private String provincia;
    private long dni;

    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public String getProvincia() {
        return provincia;
    }
    
    //setter y getter de dni
    
    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getDni() {
        return dni;
    }
}
