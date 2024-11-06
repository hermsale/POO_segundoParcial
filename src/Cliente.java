public class Cliente extends Persona{
    
    // atributos exclusivos de Cliente
    private String telefono;
    private String direccion;
    
    public Cliente(String nombre, String apellido, int edad, String email, String telefono, String direccion) {
        super(nombre, apellido, edad, email);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




}
