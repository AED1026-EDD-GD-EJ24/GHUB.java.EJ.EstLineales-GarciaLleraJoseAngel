package miPrincipal;
import java.util.Stack;

public class DemoStack {

    public static void main(String[] args) {
        //crear mi pila con elementos tipo entero
        Stack<Integer>pila=new Stack<Integer>();
        //Apilar elementos
        pila.push(2);
        pila.push(5);
        pila.push(7);
        pila.push(10);
        //consultar la posicion del elemento
        System.out.println("Posicion de elemento buscado 2 : "+pila.search(2));
        System.out.println("Posicion de elemento buscado 10 : "+pila.search(10));
        System.out.println("Posicion de elemento buscado 3 : "+pila.search(3));

        //consultar el elemento de la cima
        System.out.println("El elemento del tope ="+pila.peek());
        //Desapilar
        pila.pop();
        System.out.println("El elemento del tope ="+pila.peek());
        pila.pop();

    }
}