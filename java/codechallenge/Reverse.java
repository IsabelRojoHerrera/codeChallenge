package com.codechallenge;

public class Reverse {

    public String reversa1(String palabra){
        String reversa = "";

        for (int i=palabra.length()-1; i>=0; i--){
            reversa += palabra.charAt(i);
        }
        return reversa;
    }

    public char reversa2(String palabra, int indice){

        if (indice == 0)
            return palabra.charAt(indice);

        System.out.print(palabra.charAt(indice));
        return reversa2(palabra, indice-1);

    }

    public String reversa3(String palabra){
        String reversa="";

        while(palabra.length()>0) {
            reversa += palabra.charAt(palabra.length()-1) + "";
            palabra = palabra.substring(0,palabra.length()-1);
        }
        return reversa;
    }


    public static void main (String a []){
        Reverse r = new Reverse();

        System.out.println(r.reversa1("Hola"));
        System.out.println(r.reversa2("Hola", 3));
        System.out.println(r.reversa3("Hola"));
    }
}
