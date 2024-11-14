Esta aplicación usa la estructura MVC.
    Modelo: Cliente, Directivo, Empleado, Empresa, Persona
    Vista: Menu
    Controlador: ControladorEmpresas, Precarga

* Clase Menu

Variables primitivas:
    opcion: (línea 7 en Menu.java) es un entero que representa la opción seleccionada por el usuario en el menú.

Variables de referencia:
    controladorEmpresas: (línea 3 en Menu.java) es una referencia de tipo ControladorEmpresas utilizada para gestionar las operaciones relacionadas con las empresas.
    sc: (línea 5 en Menu.java) es una referencia de tipo Scanner utilizada para capturar la entrada del usuario.

* Clase ControladorEmpresas

Variables primitivas:
    sinResultado: (línea 9 en ControladorEmpresas.java) es un valor booleano que indica si hubo resultados en una búsqueda específica.
    opcionEmpresa: (línea 11 en ControladorEmpresas.java) es un entero que guarda el ID de la empresa seleccionada por el usuario.

Variables de referencia:
    empresas: (línea 10 en ControladorEmpresas.java) es una lista (List<Empresa>) que contiene referencias a objetos Empresa.
    sc: (línea 11 en ControladorEmpresas.java) es una referencia de tipo Scanner utilizada para capturar la entrada del usuario.

* Clase Persona (Abstracta)

Variables primitivas:
    edad: (línea 6 en Persona.java) es un entero que representa la edad de la persona.

Variables de referencia:
    nombre: (línea 5 en Persona.java) es una referencia de tipo String que almacena el nombre de la persona.
    apellido: (línea 6 en Persona.java) es una referencia de tipo String que almacena el apellido de la persona.
    email: (línea 7 en Persona.java) es una referencia de tipo String que almacena el correo electrónico de la persona.

* Clase Empresa

Variables primitivas:
    id_empresa: (línea 4 en Empresa.java) es un entero que representa el ID de la empresa.

Variables de referencia:
    nombre: (línea 5 en Empresa.java) es una referencia de tipo String que almacena el nombre de la empresa.
    direccion: (línea 6 en Empresa.java) es una referencia de tipo String que almacena la dirección de la empresa.
    cuil: (línea 7 en Empresa.java) es una referencia de tipo String que almacena el CUIL de la empresa.
    personas: (línea 8 en Empresa.java) es una lista (List<Persona>) que almacena referencias a objetos Persona.

* Clase Empleado

Variables primitivas:
    sueldo: (línea 5 en Empleado.java) es un valor double que representa el sueldo del empleado.

Variables de referencia:
    Las variables nombre, apellido, edad y email son heredadas de la clase Persona.

* Clase Directivo

Variables primitivas:
    sueldo: (heredado de Empleado).

Variables de referencia:
    categoria: (línea 4 en Directivo.java) es una referencia de tipo String que representa la categoría del directivo.
    Las variables nombre, apellido, edad y email son heredadas de Persona.

* Clase Cliente

Variables primitivas:
    Ninguna variable primitiva específica de Cliente.

Variables de referencia:
    telefono: (línea 5 en Cliente.java) es una referencia de tipo String que representa el número de teléfono del cliente.
    direccion: (línea 6 en Cliente.java) es una referencia de tipo String que representa la dirección del cliente.
    Las variables nombre, apellido, edad y email son heredadas de Persona.