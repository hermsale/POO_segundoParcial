public class Directivo extends Empleado{
    private String categoria;

    public Directivo(String nombre, String apellido, int edad, String email, int sueldo, String categoria) {
        super(nombre, apellido, edad, email, sueldo);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
    return "--------------------------------------------------------\n" +
           "| Datos del Directivo                               |\n" +
           "--------------------------------------------------------\n" +
           "| Nombre: " + getNombre() + "\n" +
           "| Apellido: " + getApellido() + "\n" +
           "| Edad: " + getEdad() + "\n" +
           "| Email: " + getEmail() + "\n" +
           "| Sueldo: " + getSueldo() + "\n" +
           "| Categoría: " + getCategoria() + "\n" +
           "--------------------------------------------------------";
    }
}
