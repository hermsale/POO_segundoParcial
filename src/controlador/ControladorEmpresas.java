package controlador;

import java.util.ArrayList;
import java.util.List;

import modelo.Directivo;
import modelo.Empleado;
import modelo.Empresa;
// import modelo.Empleado;
import modelo.Persona;

public class ControladorEmpresas {
    private List<Empresa> empresas;
    private List<Persona> personas;

    public ControladorEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
        // this.personas = new ArrayList<>();
    }
    
    // metodo para mostrar las empresas
    public void mostrarEmpresas(){
        System.out.println(empresas);
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
}
