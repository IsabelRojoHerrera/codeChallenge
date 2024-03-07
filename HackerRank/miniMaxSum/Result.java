package miniMaxSum;

import java.util.*;


class Result {

    public static void miniMaxSum(List<Integer> arr) {
    
        long min = Collections.min(arr);
        long max = Collections.max(arr);
        long sumaMin=0, sumaMax=0;
        
        if(min == max){
            for(int i=0; i<arr.size()-1;i++){
                sumaMin += arr.get(i);
                sumaMax += arr.get(i);
            }
            System.out.println((long)sumaMin+" "+sumaMax);
            return;
        }
        
        
        for(Integer i : arr){
            if(i != max)
                sumaMin += i;
            if( i!= min)
                sumaMax+=i;
                
        }
        System.out.println((long)sumaMin+" "+sumaMax);
    }

}