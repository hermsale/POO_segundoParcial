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

  
    /// metodos

    // creo un metodo polimorfico para que pueda agregar empleados o clientes
    public void agregarPersona(Persona persona){
        personas.add(persona);
    }


    // devuelve a controladorEmpresas la lista de personas que posee la empresa
    public List<Persona> getPersonas(){
        return personas;
    }
    
   

    // opcion 3
    // metodo encargado de mostrar los empleados que no son directivos, de una empresa. 
    public Empleado mostrarEmpleados(){
        // personas.forEach(persona ->{ 
        for(Persona persona : personas){
            // busco mostrar los empleados que NO sean directivos
            if(persona instanceof Empleado && !(persona instanceof Directivo)){
                // Empleado empleado = (Empleado) persona;
            //    devuelvo persona lo convierto a tipo Empleado
                return (Empleado) persona;
            }
        }; 
        return null;
    }

    // Propuesta del profesor, devolver directamente empleado y que el controlador tenga el Sout
    // public Empleado mostrarEmpleados() {
    //     for (Persona persona : personas) {
    //         if (persona instanceof Empleado && !(persona instanceof Directivo)) {
    //             return (Empleado) persona; // Retorna el empleado
    //         }
    //     }
    //     return null; // Retorna null si no encuentra empleados
    // }

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
    public Cliente mostrarClientes(){
        // personas.forEach(persona ->{
        for(Persona persona : personas){
            if(persona instanceof Cliente){
                // Cliente cliente = (Cliente) persona;
                return (Cliente) persona;
                // System.out.println(cliente);
            }
        };
        return null; // debido a que se hace un return, si o si se debe contemplar la posibilidad de que haya o no haya algo que devolver.
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

    // GETTERS Y SETTERS
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
          
    // Este override lo modifique para que muestre solo ID y nombre, para que tenga sentido la opcion 2 que es mostrar en detalle los detalles de la empresa. 
    @Override
    public String toString() {
        return  
        "\n"+
        "| ID: " + getid_empresa() + " | Nombre: " + getNombre() + " | \n" +
        "------------------------------------------------------------";
    }
    // este metodo muestra en detalle los datos de una empresa que se busca por ID

    public String toStringCompleto(){
        return
                "----------------------------------------------------------------------------------------------------------------------------\n" +
                "|                                            Datos de la Empresa                                                            |\n" +
                "----------------------------------------------------------------------------------------------------------------------------\n" +
                "| ID: " + getid_empresa() + " | Nombre: " + getNombre() + " | CUIL: " + getCuil() + " | Dirección: " + getDireccion() + "\n" +
                "----------------------------------------------------------------------------------------------------------------------------";
    }
}
