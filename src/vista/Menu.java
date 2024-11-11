package vista;
import java.util.List;
import java.util.Scanner;

import modelo.Empresa;
public final class Menu {
 Scanner sc = new Scanner(System.in);

        
        int opcion;
        int opcionEmpresa;
        boolean sinResultado=true; // esta variable funciona como bandera para verificar si hubo alguna coincidencia. En caso de no haber coincidencia, reportarlo. 
        public void mostrar(List<Empresa> empresa){

            do {
                System.out.println("----------------------------------------------------------------");
                System.out.println("Bienvenido al Sistema de Gestión de Empresas");
                System.out.println(); // 
                System.out.println("1. Mostrar Empresas disponibles");
                System.out.println("2. Mostrar datos Empresa");
                System.out.println("3. Mostrar datos Empleados");
                System.out.println("4. Mostrar datos Cliente");
                System.out.println("5. Mostrar datos Directivos");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();  // Limpiar el salto de línea
    
                switch (opcion) {
                    case 1:
                        System.out.println("Empresas disponibles: ");
                        System.out.println(empresa);
                        pausar();
                        break;
    
                    case 2:
                        System.out.println("Ingrese el ID de la empresa que desea obtener detalles");
                        opcionEmpresa = sc.nextInt();
                        sc.nextLine();
                        for (Empresa empresa2 : empresa) {
                            if(empresa2.getid_empresa() == opcionEmpresa){
                                System.out.println(empresa2);
                                sinResultado=false;
                            }
                        }  
                        // si no hubo resultados en la busqueda, se muestra este mensaje
                        if(sinResultado){
                            System.out.println("No se encontraron resultados");
                            sinResultado=false;
                        }
                        pausar();     
                    break;
                    
                    case 3:
                        System.out.println("Ingrese el ID de la empresa que desea obtener su lista de empleados");
                        opcionEmpresa = sc.nextInt();
                        sc.nextLine();
                        for (Empresa empresa2 : empresa) {
                            if(empresa2.getid_empresa() == opcionEmpresa){
                                empresa2.mostrarEmpleados();
                            }
                        }
                         // si no hubo resultados en la busqueda, se muestra este mensaje
                        if(sinResultado){
                            System.out.println("No se encontraron resultados");
                            sinResultado=false;
                        }
                        pausar();
                    break;
                    
                    case 4:
                        System.out.println("Ingrese el ID de la empresa que desea obtener su lista de clientes");
                        opcionEmpresa = sc.nextInt();
                        sc.nextLine();
                        for (Empresa empresa2 : empresa) {
                            if(empresa2.getid_empresa() == opcionEmpresa){
                                empresa2.mostrarClientes();
                            }
                        }
                        // si no hubo resultados en la busqueda, se muestra este mensaje
                        if(sinResultado){
                            System.out.println("No se encontraron resultados");
                            sinResultado=false;
                        }
                        pausar();
                    break;
                    case 5:
                        System.out.println("Ingrese el ID de la empresa que desea obtener su lista de directivos");
                        opcionEmpresa = sc.nextInt();
                        sc.nextLine();
                        for (Empresa empresa2 : empresa) {
                            if(empresa2.getid_empresa() == opcionEmpresa){
                                empresa2.mostrarDirectivos();
                            }
                        }
                        // si no hubo resultados en la busqueda, se muestra este mensaje
                        if(sinResultado){
                            System.out.println("No se encontraron resultados");
                            sinResultado=false;
                        }
                        pausar();
                    break;

                    case 6:
                    System.out.println("Muchas gracias por utilizar la aplicación");
                    break;
                    
                    default:
                    System.out.print(
                        "--------------------------------------------------------\n" +
                        "| Ingrese una opción valida                             |\n" +
                        "--------------------------------------------------------\n"
                    );
                    break;
                    
                }
    
                System.out.println();  // Espacio para la próxima iteración
            } while (opcion != 6);
        }
 
        // funcion que se auto ejecuta, permite hacer una pausa antes de mostrar el menu nuevamente
        public static void pausar() {
            System.out.print("Presione Enter para continuar");
            try {
                System.in.read();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
