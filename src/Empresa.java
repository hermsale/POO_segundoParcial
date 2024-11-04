import java.util.List;

public class Empresa {
    private String nombre;
    private String direccion;
    private String cuil;
    private List<Persona> personas;

    
    public Empresa(String nombre, String direccion, String cuil, List<Persona> personas) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.cuil = cuil;
        this.personas = personas;
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
    
    
    // metodos
    public void mostrarEmpleados(){

    }
    
    public void mostrarClientes(){
        
    }

    public Persona crearEmpleado(){
            return null;
    }

    public Persona crearCliente(){
        return null;
}
}
