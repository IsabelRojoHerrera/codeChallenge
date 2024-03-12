package Sparse_Arrays_2;


import java.util.*;

class Result {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        
        List<Integer> contadores = new ArrayList<>();
        
        
        for(String q: queries){
            contadores.add(0);
        }

        for(int i=0; i<queries.size(); i++){
            for(int j=0; j<strings.size(); j++){
                if(queries.get(i).equals(strings.get(j)))
                    contadores.set(i, contadores.get(i)+1);
            }
        }


    return contadores;
    }

}
