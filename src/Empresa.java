import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String direccion;
    private String cuil;
    // declaramos un arrayList de Persona
    private List<Persona> personas;

    
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
    
    
    // metodos

    // creo un metodo polimorfico para que pueda agregar empleados o clientes
    public void agregarPersona(Persona persona){
        personas.add(persona);
    }

    public void mostrarEmpleados(){

    }
    
    public void mostrarClientes(){
        
    }

    // metodo para crear instancias de empleado
    public Persona crearEmpleado(String nombre, String apellido, int edad, String email, String sueldo, String categoria){
            Empleado empleado = new Empleado(nombre, apellido, edad, email, sueldo, categoria);
            agregarPersona(empleado);
            return empleado;
    }

      // metodo para crear instancias de cliente
    public Persona crearCliente(String nombre, String apellido, int edad, String email, String telefono, String direccion){
        // genero un nuevo cliente con los datos obtenidos
        Cliente cliente = new Cliente(nombre, apellido, edad, email, telefono, direccion);
        // agrego a la lista al nuevo cliente
        agregarPersona(cliente);
        return cliente;
}
}
