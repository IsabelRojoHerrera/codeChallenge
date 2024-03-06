import java.util.Arrays;

public class Consecutivos{

    public boolean esConsecutivo(int [] numeros){
       
        Arrays.sort(numeros);

        for(int i=0; i<numeros.length-1; i++){
            if(numeros[i] == numeros[i+1])
            return false;
        }
        return true;
    }


    public static void main (String a[]){

        Consecutivos c = new Consecutivos();
        int array [] = {1,5,3,4,4,6,4,8,9};

        System.out.println(c.esConsecutivo(array));
    }


}