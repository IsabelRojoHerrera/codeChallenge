import java.util.*;


class Result {

    public static void plusMinus(List<Integer> arr) {
    
        int positivos=0;
        int negativos=0;
        int zero=0;
        
        for(Integer i: arr){
            if(i > 0)
                positivos++;
            
            if(i < 0)
                negativos++;
            
            if(i == 0)
                zero++;
        }
        
        System.out.printf("%.6f\n",(float)positivos/arr.size());
        System.out.printf("%.6f\n",(float)negativos/arr.size());
        System.out.printf("%.6f\n",(float)zero/arr.size());
    }

}