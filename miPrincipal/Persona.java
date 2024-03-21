package miPrincipal;

import javax.print.DocFlavor.STRING;

public class Persona {
    private String nombre;
    private int edad;
    private String Nacionalidad;
    public Persona(String nombre, int edad, String Nacionalidad){
        this.nombre=nombre;
        this.edad=edad;
        this.Nacionalidad=Nacionalidad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getNacionalidad(){
        return Nacionalidad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setNacionalidad(String Nacionalidad){
        this.Nacionalidad=Nacionalidad;
    }
    @Override
    public String toString(){
        return nombre + ", " + edad + ", " + Nacionalidad;
    }
}
