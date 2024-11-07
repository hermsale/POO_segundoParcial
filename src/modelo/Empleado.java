package modelo;
public class Empleado extends Persona{
    
    // atributos exclusivos de Emplado 
    private int sueldo;
        
    public Empleado(String nombre, String apellido, int edad, String email, int sueldo) {
        super(nombre, apellido, edad, email);
        this.sueldo = sueldo;
    }

    
    public int getSueldo() {
        return sueldo;
    }


    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
    return "--------------------------------------------------------\n" +
           "| Datos del Empleado                                   |\n" +
           "--------------------------------------------------------\n" +
           "| Nombre: " + getNombre() + "\n" +
           "| Apellido: " + getApellido() + "\n" +
           "| Edad: " + getEdad() + "\n" +
           "| Email: " + getEmail() + "\n" +
           "| Sueldo: " + getSueldo() + "\n" +
           "--------------------------------------------------------";
    }

}
