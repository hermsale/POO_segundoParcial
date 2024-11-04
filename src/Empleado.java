public class Empleado extends Persona{
    
    private String sueldo;
    private String categoria;

    public Empleado(String nombre, String apellido, int edad, String email, String sueldo, String categoria) {
        super(nombre, apellido, edad, email);
        this.sueldo = sueldo;
        this.categoria = categoria;
    }

    
}
