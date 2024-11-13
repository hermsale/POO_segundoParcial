package controlador;

import java.util.List;
import java.util.Scanner;

import modelo.Directivo;
import modelo.Empleado;
import modelo.Empresa;
import modelo.Persona;

public class ControladorEmpresas {
    private boolean sinResultado = true;
    private List<Empresa> empresas;
    private Scanner sc = new Scanner(System.in);
    private int opcionEmpresa;

    public ControladorEmpresas(List<Empresa> empresas) {
        // asigno a empresas lo que llega por parametro al constructor
        this.empresas = empresas;
    }

    // opcion 1 - mostrar todas las empresas cargadas (muestra solo ID y nombre)
    public void mostrarEmpresas() {
        System.out.print("----------------------------------------------------------\n" +
                            "| Empresas Disponibles                                   |\n" +
                            "--------------------------------------------------------\n");
        System.out.println(empresas);
    }

    // opcion 2 - muestra una empresa con todos los datos completos. se debe especificar a cual ID se hace la consulta de la empresa
    public void mostrarEmpresa() {
        sinResultado = true;
        System.out.println("Ingrese el ID de la empresa que desea obtener detalles");
        opcionEmpresa = sc.nextInt();
        sc.nextLine();
        for (Empresa empresa : empresas) {
            if (empresa.getid_empresa() == opcionEmpresa) {
                empresa.mostrarEmpresa();
                sinResultado = false;
            }
        }
        // si no hubo resultados en la busqueda, se muestra este mensaje
        if (sinResultado) {
            System.out.println("No se encontraron resultados");
        }
    }

    // opcion 3 - mostrar empleados de la empresa que se indique por ID 
    public void mostrarEmpleados() {
        sinResultado = true;
        System.out.println("Ingrese el ID de la empresa que desea obtener su lista de empleados");
        opcionEmpresa = sc.nextInt();
        sc.nextLine();
        // recorro empresas
        for (Empresa empresa : empresas) {
            if (empresa.getid_empresa() == opcionEmpresa) {
                List<Persona> personasEmpresa = empresa.getPersonas();
                personasEmpresa.forEach(persona -> {
                    // busco mostrar los empleados que NO sean directivos
                    if (persona instanceof Empleado && !(persona instanceof Directivo)) {
                        Empleado empleado = (Empleado) persona;
                        System.out.println(empleado);
                    }
                });
                sinResultado = false;
            }
        }
        // si no hubo resultados en la busqueda, se muestra este mensaje
        if (sinResultado) {
            System.out.println("No se encontraron resultados");
        }
    }

    // opcion 4 - muestro los clientes de la empresa seleccionada
    public void mostrarClientes() {
        sinResultado = true;
        System.out.println("Ingrese el ID de la empresa que desea obtener su lista de clientes");
        opcionEmpresa = sc.nextInt();
        sc.nextLine();
        for (Empresa empresa : empresas) {
            if (empresa.getid_empresa() == opcionEmpresa) {
                empresa.mostrarClientes();
                sinResultado = false;
            }
        }
        // si no hubo resultados en la busqueda, se muestra este mensaje
        if (sinResultado) {
            System.out.println("No se encontraron resultados");
        }
    }

    // opcion 5 - mostrar directivos
    public void mostrarDirectivos() {
        sinResultado = true;
        System.out.println("Ingrese el ID de la empresa que desea obtener su lista de directivos");
        opcionEmpresa = sc.nextInt();
        sc.nextLine();
        for (Empresa empresa : empresas) {
            if(empresa.getid_empresa() == opcionEmpresa){
                empresa.mostrarDirectivos();
                sinResultado=false;
            }
        }
        // si no hubo resultados en la busqueda, se muestra este mensaje
        if(sinResultado){
            System.out.println("No se encontraron resultados");
        }
    }
}
