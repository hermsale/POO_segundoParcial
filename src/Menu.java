import java.util.Scanner;

import controlador.EmpresaController;

public final class Menu {
 Scanner sc = new Scanner(System.in);
        int opcion;
        EmpresaController ec = new EmpresaController();
        public void mostrar(){

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
                        
                        break;
    
                    case 2:
                        System.out.println("Aca muestro empleado");
                        ec.mostrarEmpleados();
                        // empresa.mostrarDirectivos();
                        break;
    
                    case 3:
                    System.out.println("Aca muestro cliente");
                        // empresa.mostrarClientes();
                        break;
    
                    case 4:
                    System.out.println("Aca muestro directivo");

                    break;
                    case 5:
                    System.out.println("Muchas gracias");
                    break;
                }
    
                System.out.println();  // Espacio para la próxima iteración
            } while (opcion != 5);
        }
        // Empresa empresa = new Empresa("Insumo Acuario", "Hungria 1222", "20-35224895-5", null);

}
