package com.pluralsight;

public class vocales {


    private String[] palabras;
    private String coordenadas;


    public vocales(String[] palabras) {
        this.palabras = palabras;
        coordenadas = "";
        match();
        System.out.println(getCoordenadas());
        System.out.println(resultado());

    }

    public void match(){

        for( int i=0; i<palabras.length; i++){
            for (int j=0; j<palabras[i].length(); j++ ){
                if(j+1<palabras[i].length() && esVocal(palabras[i].charAt(j)) && esVocal(palabras[i].charAt(j+1))){
                    guardaCoordenada(i+""+j+""+i+""+(j+1));
                }
            }
            System.out.println(palabras[i]);
        }
    }

    public void guardaCoordenada(String coo){
        coordenadas += coo;
    }

    public String resultado(){

        for( int i=1; i<coordenadas.length(); i+=4){
            if(coordenadas.charAt(i) == coordenadas.charAt(i+4))
                return coordenadas.charAt(i-1)+", "+coordenadas.charAt(i);
        }
        return "No hay coincidencias";
    }

    public boolean esVocal(char letra){
        if (letra == 'a' || letra == 'e' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
            return true;
        return false;
    }

    public String getCoordenadas(){
        return coordenadas;
    }

}


