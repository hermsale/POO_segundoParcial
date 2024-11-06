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
    
    
    /// metodos

    // creo un metodo polimorfico para que pueda agregar empleados o clientes
    public void agregarPersona(Persona persona){
        personas.add(persona);
    }

    public void mostrarEmpleados(){
        personas.forEach(persona ->{
            // busco mostrar los empleados que NO sean directivos
            if(persona instanceof Empleado && !(persona instanceof Directivo)){
                Empleado empleado = (Empleado) persona;
                System.out.println(empleado);
            }
        });
    }

    // genero un metodo para mostrar los directivos
    public void mostrarDirectivos(){
        personas.forEach(persona ->{
            if (persona instanceof Directivo) { // verifico que cada persona sea instancia de Directivo  
                Directivo directivo = (Directivo) persona; // si lo es, hago un casteo a persona para que lo trate como Directivo y acceda a sus propiedades
                System.out.println(directivo); // imprimo directivo
            }
        });
    }
    
    public void mostrarClientes(){
        
    }

    // metodo para crear instancias de empleado
    public Persona crearEmpleado(String nombre, String apellido, int edad, String email, int sueldo){
            Empleado empleado = new Empleado(nombre, apellido, edad, email, sueldo);
            agregarPersona(empleado);
            return empleado;
    }

    
    // metodo para crear instancias de directivo
    public Persona crearDirectivo(String nombre, String apellido, int edad, String email, int sueldo, String categoria){
        Directivo directivo = new Directivo(nombre, apellido, edad, email, sueldo, categoria);
        agregarPersona(directivo);
        return directivo;
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
