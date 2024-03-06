package com.codechallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumerosPrimos {
    int [] numeros = null;
    ArrayList primos = null;
    public NumerosPrimos (int [] numeros ){
        this.numeros = numeros;
        soloPrimos();
        getPrimos();
    }

    private void soloPrimos(){

        for(int i=0; i<numeros.length; i++){
            if(numeros[i]%numeros[i]==0)
                primos.add(numeros[i]);
        }
    }

    public void getPrimos(){
        for (int i=0; i<primos.size(); i++){
            System.out.println(primos.indexOf(i));
        }
    }




    public static void main (String a[]){
     //   int [] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    //    NumerosPrimos np = new NumerosPrimos(numeros);

    }
}
