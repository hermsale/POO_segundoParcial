import java.util.List;
import java.util.Scanner;

import modelo.Empresa;
public final class Menu {
 Scanner sc = new Scanner(System.in);

        
        int opcion;
    
        public void mostrar(List<Empresa> empresa){

            do {
                System.out.println("Bienvenido al Sistema de Gestión de Empresas");
                System.out.println("1. Mostrar datos Empresa");
                System.out.println("2. Mostrar datos Empleado");
                System.out.println("3. Mostrar datos Cliente");
                System.out.println("4. Mostrar datos Directivos");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();  // Limpiar el salto de línea
    
                switch (opcion) {
                    case 1:
                        System.out.println("Aca muestro empresa");
                        System.out.println(empresa);
                        break;
    
                    case 2:
                        System.out.println("Aca muestro empleado");
                        for (Empresa empresa2 : empresa) {
                            if (empresa2.getNombre().equals("Tech Solutions")) {
                                empresa2.mostrarEmpleados();
                            
                            }
                        }             
                        break;
    
                    case 3:
                        System.out.println("Aca muestro cliente");
                        // empresa.mostrarClientes();
                        break;
    
                    case 4:
                    System.out.println("Aca muestro directivo");
                    // empresa.mostrarDirectivos();
                    break;
                    case 5:
                    System.out.println("Muchas gracias por utilizar la aplicación");
                    break;
                }
    
                System.out.println();  // Espacio para la próxima iteración
            } while (opcion != 5);
        }
        
}
