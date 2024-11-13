package vista;

import java.util.Scanner;
import controlador.ControladorEmpresas;
public final class Menu {
    
    // se crea una referencia interna de controladorEmpresa. 
        private ControladorEmpresas controladorEmpresas;
        
        private Scanner sc = new Scanner(System.in);  
        
        // variable utilizada para gestionar las distintas opciones 
        private int opcion; 
    
        // se recibe la inyeccion de dependencias en el constructor, enviado desde menuPrincipal.mostrar(), para gestionar controladorEmpresas desde Menu
        public Menu(ControladorEmpresas controladorEmpresas) {
            this.controladorEmpresas = controladorEmpresas;
        }
    

        public void mostrar(){

            do {
                System.out.println("----------------------------------------------------------------");
                System.out.println("Bienvenido al Sistema de Gestión de Empresas");
                System.out.println(); 
                System.out.println("1. Mostrar Empresas disponibles");
                System.out.println("2. Mostrar datos Empresa");
                System.out.println("3. Mostrar datos Empleados");
                System.out.println("4. Mostrar datos Cliente");
                System.out.println("5. Mostrar datos Directivos");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();  
    
                switch (opcion) {
                    case 1:
                        controladorEmpresas.mostrarEmpresas(); // muestra todas las empresas cargadas
                        pausar();
                        break;
    
                    case 2:
                        controladorEmpresas.mostrarEmpresa(); // solicita un ID de una empresa y muestra sus datos
                        pausar();     
                    break;
                    
                    case 3:
                        controladorEmpresas.mostrarEmpleados();
                        pausar();
                    break;
                    
                    case 4:
                        controladorEmpresas.mostrarClientes();
                        pausar();
                    break;

                    case 5:
                        controladorEmpresas.mostrarDirectivos();
                        pausar();
                    break;

                    case 6:
                    System.out.println("¡Muchas gracias por utilizar la aplicación!");
                    break;
                    
                    default:
                    System.out.print(
                        "--------------------------------------------------------\n" +
                        "| Ingrese una opción valida                             |\n" +
                        "--------------------------------------------------------\n"
                    );
                    break;
                    
                }
                // System.out.println();  
            } while (opcion != 6);
            sc.close();
        }
        // funcion que se auto ejecuta, permite hacer una pausa antes de mostrar el menu nuevamente
        public static void pausar() {
            System.out.println("Presione Enter para continuar");
            try {
                System.in.read();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
}
