public class Cliente extends Persona{
    
    // atributos exclusivos de Cliente
    private String telefono;
    private String direccion;


    public Cliente(String nombre, String apellido, int edad, String email, String telefono, String direccion) {
        super(nombre, apellido, edad, email);
        this.telefono = telefono;
        this.direccion = direccion;
    }


}
