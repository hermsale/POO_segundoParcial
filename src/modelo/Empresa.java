package modelo;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private int id_empresa;
    private String nombre;
    private String direccion;
    private String cuil;
    private List<Persona> personas; // declaramos un arrayList de Persona

    
    public Empresa(int id_empresa, String nombre, String direccion, String cuil, List<Persona> personas) {
        this.id_empresa = id_empresa;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuil = cuil;
        this.personas = new ArrayList<>(); // inicializamos la lista
    }

    public int getid_empresa() {
        return id_empresa;
    }

    public void setid_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
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


    // devuelve a controladorEmpresas la lista de personas que posee la empresa
    public List<Persona> getPersonas(){
        return personas;
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
    
    // vista de los clientes cargados
    public void mostrarClientes(){
        personas.forEach(persona ->{
            if(persona instanceof Cliente){
                Cliente cliente = (Cliente) persona;
                System.out.println(cliente);
            }
        });
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

    public Empresa crearEmpresa(int id_empresa, String nombre, String direccion, String cuil, List<Persona> personas){
        Empresa empresa = new Empresa(id_empresa, nombre, direccion, cuil, personas);
        return empresa;
        
    }

    @Override
    public String toString() {
        return  
        "--------------------------------------------------------\n" +
        "| Datos de la Empresa                                   |\n" +
        "--------------------------------------------------------\n" +
        "| ID: " + getid_empresa() + "\n" +
        "| Nombre: " + getNombre() + "\n" +
        "--------------------------------------------------------";
    }
}
