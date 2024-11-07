package modelo;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String direccion;
    private String cuil;
    private List<Persona> personas; // declaramos un arrayList de Persona

    
    public Empresa(String nombre, String direccion, String cuil, List<Persona> personas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuil = cuil;
        this.personas = new ArrayList<>(); // inicializamos la lista
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCuil() {
        return cuil;
    }
    public void setCuil(String cuil) {
        this.cuil = cuil;
    }
    

    @Override
    public String toString() {
        return  "--------------------------------------------------------\n" +
        "| Datos de la Empresa                               |\n" +
        "--------------------------------------------------------\n" +
        "| Nombre: " + getNombre() + "\n" +
        "| CUIL: " + getCuil() + "\n" +
        "| Dirección: " + getDireccion() + "\n" +
        "--------------------------------------------------------";
    }
}
