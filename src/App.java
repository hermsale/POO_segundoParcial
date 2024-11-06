public class App {
    public static void main(String[] args) throws Exception {
       
        // creo una empresa 
        Empresa empresaUno = new Empresa("Insumo Acuario","Hungria 1222", "20-35224895-5", null);
      

        // creo empleados
        empresaUno.crearEmpleado("Alejandro","Herms",34,"Alejandro.Davinci@davinci.edu.ar",2800000);
        empresaUno.crearEmpleado("Agustin","Tejero",33,"Agustin.Tejero@davinci.edu.ar",3000000);
        empresaUno.crearEmpleado("Martin","Vega",30,"Martin.Vega@davinci.edu.ar",1800000);
        empresaUno.crearEmpleado("Miguel","Atampiz",27,"Miguel.Atampiz@davinci.edu.ar",2000000);
        empresaUno.crearEmpleado("Diego","Portnoy",22,"Diego.Portnoy@davinci.edu.ar",1200000);
        
        // creo un directivo
        empresaUno.crearDirectivo("Marcelo", "Juarez", 55, "Marcelo.Juarez@insumos.com", 50000000, "Gerente");


        // creo clientes
        empresaUno.crearCliente("Martin", "Lopez", 42, "Martin.Lopez@deheza.com", "1136529874", "Siempre Viva 1234");

        empresaUno.mostrarEmpleados();
        empresaUno.mostrarDirectivos();
                
    }
}
