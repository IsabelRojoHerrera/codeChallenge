package Sparse_Arrays;


import java.util.*;

class Result {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        
        LinkedHashMap<String, Integer> contadores = new LinkedHashMap<>();
        List<Integer> result = new ArrayList<>();
        
        
        for(String dato : queries){
            if(contadores.containsKey(dato))
            contadores.put(dato, 0);
        }
        System.out.println(queries.size());

        for (int i=0; i<strings.size(); i++){
            if(contadores.containsKey(strings.get(i)))
                contadores.put(strings.get(i), contadores.get(strings.get(i))+1);
        }
        for (Map.Entry<String, Integer> contador : contadores.entrySet()) {
            result.add(contador.getValue());
        }
    return result;
    }

}
