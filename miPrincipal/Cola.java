package miPrincipal;
public class Cola<T> {
    //Declarar atributo cabeza, q apnta al primer elemento de la cola
    private Nodo<T> cabeza;
    //Atributo cola q apunta al ultimo elemento de la cola
    private Nodo<T> cola;
    //Almacena eñ total de elementos de la cola
    private int tamanio;
    //Construcor por defecto
    public Cola(){
        cabeza = null;
        cola = null;
        tamanio = 0; 
    }
    //Devuelva el total de elementos de la cola
    public int getTamanio(){
        return tamanio;
    }
    //Verificar si la cola esta vacia
    public boolean esVacia(){
        return(cabeza==null);
    }
    //Encolar un elemento nuevo
    public void encolar(T valor){
        //crear un nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();
        //Fijar valor dentro del nodo
        nuevo.setValor(valor);
        if(esVacia()){
            //cabeza y nodo apuntan al nuevo nodo
            cabeza = nuevo;
            cola = nuevo;
        }else{
            //se enlaza el campo siguiente de la cola con el nuevo elemento
            cola.setSiguiente(nuevo);
            //La nueva cola pasa a ser nuevo
            cola = nuevo;
        }
        //Incrementa el tamanio pq hay un nuevo elemento en la cola
        tamanio++;
    }
    //Eliminar el primer elemento de la cola
    public void desencolar(){
        //si no es vacia
        if(!esVacia()){
            //verificar si hay un solo elemento en la cola
            if(cabeza==cola){
                cabeza = null;
                cola=null;
            }else{
                //eliminar el primer elemento de la cola
                //desplazando la cabeza al siguiente nodo
                cabeza=cabeza.getSiguiente();
            }
            //se disminuye el total de elementos
            tamanio--;
        }
    }
    //Devuelve el primer elemento de la cola
    public T frente(){
        if(!esVacia())
            return cabeza.getValor();
        else
            return null;
    }
    
}