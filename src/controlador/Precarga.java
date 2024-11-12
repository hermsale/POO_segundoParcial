package controlador;

import java.util.ArrayList;
import java.util.List;

import modelo.Empresa;

public class Precarga {

        // Genero esta clase static que funciona para hacer una pre carga de todos los datos necesarios para el correcto funcionamiento de la App
        public static List<Empresa> cargaDatos(){
            List<Empresa> empresas = new ArrayList<Empresa>();

        //     creo empresas
            Empresa empresaUno = new Empresa(1,"Insumo Acuario","Hungria 1222", "20-35224895-5", null);
            Empresa empresaDos = new Empresa(2,"Tech Solutions", "Av. Siempre Viva 1234", "30-67891234-6", null);

            
            // creo empleados de empresa uno
             
             empresaUno.crearEmpleado("Alejandro","Herms",34,"Alejandro.Herms@Insumo.ar",2800000);
             empresaUno.crearEmpleado("Agustin","Tejero",33,"Agustin.Tejero@Insumo.ar",3000000);
             empresaUno.crearEmpleado("Martin","Vega",30,"Martin.Vega@Insumo.ar",1800000);
             empresaUno.crearEmpleado("Miguel","Atampiz",27,"Miguel.Atampiz@Insumo.ar",2000000);
             empresaUno.crearEmpleado("Diego","Portnoy",22,"Diego.Portnoy@Insumo.ar",1200000);
             
             // creo un directivo de empresa uno
             empresaUno.crearDirectivo("Marcelo", "Juarez", 55, "Marcelo.Juarez@Insumo.com", 50000000, "Gerente");
             // creo clientes de empresa uno
             empresaUno.crearCliente("Martin", "Lopez", 42, "Martin.Lopez@deheza.com", "1136529874", "Siempre Viva 1234");


             empresaDos.crearEmpleado("Laura", "Gomez", 28, "laura.gomez@techsolutions.com", 2500000);
             empresaDos.crearEmpleado("Diego", "Morales", 48, "Diego.Morales@techsolutions.com", 1400000);
             empresaDos.crearEmpleado("Pablo", "Casteñeda", 32, "pablo.casta@techsolutions.com", 1700000);
             
             empresaDos.crearCliente("Carlos", "Pérez", 40, "carlos.perez@cliente.com", "114567890", "Calle Falsa 123");
             empresaDos.crearDirectivo("Ana", "Martinez", 50, "ana.martinez@techsolutions.com", 5500000, "CEO");

             empresas.add(empresaUno);
             empresas.add(empresaDos);
        return empresas;
        }

        
}
 