package miPrincipal;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;
import cuadrupedo.Cuadrupedo;

public class DemoLinkedListCuadrupedos {
    public static void menu(){
        System.out.println("************************");
        System.out.println("       ARRAYLIST        ");
        System.out.println("       CUADRUPEDOS       ");
        System.out.println("************************");
        System.out.println();
        try{
            List<Cuadrupedo> cuadrupedos = new LinkedList<>();
            String [] tipos = {"Leon","Gato","Perro","Elefante"};
            Random r = new Random();
            for(int i=0;i<10000;i++){
                String tipo = tipos[random.nextInt(tipos.length)];
                cuadrupedos.add(new Cuadrupedo(i, tipo));
            }

            int leonCount = 0, gatoCount = 0, perroCount = 0, elefanteCount = 0;
            for(Cuadrupedo cuadrupedo:cuadrupedo){
                if(cuadrupedo.getIdCuadrupedo()%1000==0){
                    System.out.println("ID"+cuadrupedo.getIdCuadrupedo()+", tipo"+cuadrupedo.getTipo());
                }
                switch (cuadrupedo.getTipo()) {
                    case "León":
                        
                        break;
                    case "Gatp";

                    case
                
                    default:
                        break;
                }

            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
