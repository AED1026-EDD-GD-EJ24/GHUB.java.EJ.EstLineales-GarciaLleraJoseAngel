package miPrincipal;

import java.util.ArrayList;

public class DemoArrayListContacto {
    
    public static void menu(String[] args) {
        // Crear una lista de contactos utilizando ArrayList
        ArrayList<Contacto> listaContactos = new ArrayList<>();

        // Agregar 3 objetos de la clase Contacto
        listaContactos.add(new Contacto("Fernando", "Castro", 
           "C11 No 12 Culiacan", "fernandocastro@gmail.com", 
           "6677160732", "6677511511"));

        listaContactos.add(new Contacto("Maria Andrea", "Vargas",
           "C11 No 705 Culiacan", "mariv@gmail.com",
           "6677121429", "6677306142"));

        listaContactos.add(new Contacto("Carolina", "Sanchez",
           "Dirección de Carolina", "carolsa@gmail.com",
           "6677121212", "6677982515"));

        // Agregar un nuevo contacto en la posición 1
        listaContactos.add(1, new Contacto("Nuevo", "Contacto",
           "Nueva Dirección", "nuevocontacto@gmail.com",
           "0000000000", "1111111111"));

        // Agregar un nuevo contacto en la posición 2
        listaContactos.add(2, new Contacto("Otro", "Contacto",
           "Otra Dirección", "otrocontacto@gmail.com",
           "2222222222", "3333333333"));

        // Mostrar los 5 objetos por pantalla
        System.out.println("--- Listado de contactos ---");
        for (Contacto contacto : listaContactos) {
            System.out.println("Nombres: " + contacto.getNombres());
            System.out.println("Apellidos: " + contacto.getApellidos());
            System.out.println("Dirección: " + contacto.getDireccion());
            System.out.println("Correo: " + contacto.getCorreo());
            System.out.println("Teléfono: " + contacto.getTelefono());
            System.out.println("Celular: " + contacto.getCelular());
            System.out.println();
        }

        // Eliminar el último contacto de la lista
        listaContactos.remove(listaContactos.size() - 1);

        // Mostrar los contactos después de la eliminación
        System.out.println("--- Listado de contactos después de eliminar el último ---");
        for (Contacto contacto : listaContactos) {
            System.out.println("Nombres: " + contacto.getNombres());
            System.out.println("Apellidos: " + contacto.getApellidos());
            System.out.println("Dirección: " + contacto.getDireccion());
            System.out.println("Correo: " + contacto.getCorreo());
            System.out.println("Teléfono: " + contacto.getTelefono());
            System.out.println("Celular: " + contacto.getCelular());
            System.out.println();
        }
    }

    
}

