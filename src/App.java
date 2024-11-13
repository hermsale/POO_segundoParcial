
import java.util.List;

import controlador.ControladorEmpresas;
import controlador.Precarga;
import modelo.Empresa;
import vista.Menu;
public class App {
    public static void main(String[] args) throws Exception {
        // MVC - se pretende que el sistema sea con arquitectura MVC Modelo Vista Controlador. Organizado por carpetas. 
        // Modelo: contendrá las clases de datos (Persona, Empleado, Cliente, Directivo, Empresa).
        // Vista: se encargará de la interacción con el usuario (podría ser la consola en este caso).
        // Controlador: gestionará la lógica de la aplicación y controlará el flujo entre el modelo y la vista.
               
        // Precarga es un metodo estatico, lo que permite utilizar su metodo sin necesidad de ser instanciado
        // uso un metodo para pre cargar los datos y lo guardo en cargaEmpresa
        List<Empresa> cargaEmpresa = Precarga.cargaDatos();
        
        // ControladorEmpresas se encuentra en la carpeta CONTROLADOR
        // controladorEmpresas gestiona toda la logica de solicitudes. Se le envia los datos previamente cargados en cargaEmpresa
        ControladorEmpresas controlador = new ControladorEmpresas(cargaEmpresa);

        // Menu se encuentra en la carpeta VISTA
        //  se encarga de mostrar las distintas opciones disponibles: empresas, empresa, cliente, empleado, directivo. a su vez, le inyecto el controlador, para que tenga acceso directo a ControladorEmpresa
        Menu menuPrincipal = new Menu(controlador);

        menuPrincipal.mostrar();           

    }
}
