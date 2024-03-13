import java.util.*;

public class lonelyinteger {

    public int isLonelyInteger(List<Integer> a) {

        for (int i=0; i<a.size(); i++){
            
            if(esRepetidoTwice(a, a.get(i)))
                return a.get(i);
        }
    return -1;
    }

    public boolean esRepetidoTwice(List <Integer> lista, Integer dato){

        // este método determina si un elemento está dos o más veces en una lista
        // si devuelve verdadero el elemento existe solo una vez, si regresa false, existe dos o más veces
        
        List <Integer> indices = new ArrayList<>();

        for(Integer i : lista){
            System.out.println(i+"  "+dato);
            if(i == dato){
                
                indices.add(i);
            }
        }
        return indices.size()==1;
    }

    public static void main (String a[]){
        List <Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(1);
        lista.add(2);


        lonelyinteger obj = new lonelyinteger();
        System.out.println(obj.isLonelyInteger(lista));

    }
    

}