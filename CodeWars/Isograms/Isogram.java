package CodeWars.Isograms;

import java.util.*;

public class Isogram {

    public  boolean  isIsogram(String str) {
        
        str = str.toLowerCase();
        List<Character> palabra = new ArrayList();
        
        for(int i=0; i<str.length(); i++){

            if(palabra.contains(str.charAt(i)))
                return false;

            palabra.add(str.charAt(i));
        }
        return true;
    }

    public static void main (String a[]){

        Isogram i = new Isogram();

        System.out.println(i.isIsogram("hola"));
    }
}

