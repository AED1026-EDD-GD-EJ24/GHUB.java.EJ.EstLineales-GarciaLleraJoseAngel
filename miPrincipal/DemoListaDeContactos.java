package miPrincipal;

public class DemoListaDeContactos {
    
    public static void menu()  {
        System.out.println("************************");
        System.out.println("   LISTA DE CONTACTOS   ");
        System.out.println("************************");
        System.err.println();

        ListaDeContactos contactos= new ListaDeContactos();
        //Agregar contactos

    contactos.agregarContactos("Payan","Lopez Saucedo", "calle 13", "Payan@Lopez.com", "111111", "4354335");
    contactos.agregarContactos("Carolina","Herrera", "calle 12", "Carolina@Herrera.com", "22222", "54335");
    contactos.agregarContactos("Federica","Cardenas", "calle 11", "Federica@C.com", "33333", "77774335");
    
    Lista<Contacto> listado=contactos.mostrarTodosLosContactos();
    
    System.out.println("**LISTADO DESPUES DE LA AGRAGACION**");
    for (int i=0;i<listado.getTamanio();i++) {
        System.out.println(listado.getValor(i));
        
    }
    if (contactos.eliminaContacto("Carolina", "Herrera")) {
        System.out.println("**LISTADO DESPUES DE LA ELIMINACION**");
    for (int i=0;i<listado.getTamanio();i++) {
        System.out.println(listado.getValor(i));
        
    }
    }
    }
}