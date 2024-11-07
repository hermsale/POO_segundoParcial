import controlador.EmpresaController;
import controlador.Precarga;
import modelo.Empresa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido");
        Menu men = new Menu();
        men.mostrar();
    // MVC - se pretende que el sistema sea con arquitectura MVC Modelo Vista Controlador. Organizado por carpetas. 
    // Modelo contendrá las clases de datos (Persona, Empleado, Cliente, Directivo, Empresa).
    // Vista se encargará de la interacción con el usuario (podría ser la consola en este caso).
    // Controlador gestionará la lógica de la aplicación y controlará el flujo entre el modelo y la vista.

   
            // creo una empresa 
            // Empresa empresaUno = new Empresa("Insumo Acuario","Hungria 1222", "20-35224895-5", null);
            
            EmpresaController empresaController = new EmpresaController();

            empresaController.crearEmpresa("Insumo Acuario","Hungria 1222", "20-35224895-5", null);
            empresaController.crearEmpleado("Alejandro","Herms",34,"Alejandro.Davinci@davinci.edu.ar",2800000);
            // empresaController.mostrarEmpleados();
            // creo empleados
             
            //  empresaUno.crearEmpleado("Alejandro","Herms",34,"Alejandro.Davinci@davinci.edu.ar",2800000);

            //  empresaUno.crearEmpleado("Agustin","Tejero",33,"Agustin.Teje ro@davinci.edu.ar",3000000);
            //  empresaUno.crearEmpleado("Martin","Vega",30,"Martin.Vega@davinci.edu.ar",1800000);
            //  empresaUno.crearEmpleado("Miguel","Atampiz",27,"Miguel.Atampiz@davinci.edu.ar",2000000);
            //  empresaUno.crearEmpleado("Diego","Portnoy",22,"Diego.Portnoy@davinci.edu.ar",1200000);
             
             // creo un directivo
            //  empresaUno.crearDirectivo("Marcelo", "Juarez", 55, "Marcelo.Juarez@insumos.com", 50000000, "Gerente");
     
     
             // creo clientes
            //  empresaUno.crearCliente("Martin", "Lopez", 42, "Martin.Lopez@deheza.com", "1136529874", "Siempre Viva 1234");
        
            //  empresaUno.mostrarEmpleados();
            // System.out.println(empresaUno);
            

    }
}
