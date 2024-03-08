import java.io.*;
import java.util.*;

public class CamelCase {
    
    
    
    public void Result(List<String> input){

        String resultado;
        
        for(String s : input){
            
            resultado = "";
            
            if (s.charAt(0) == 'S'){
                
                switch(s.charAt(2)){
                    
                    case 'C':
                    resultado += Character.toLowerCase(s.charAt(4));
                        for(int i=5; i<s.length(); i++){
                            if(Character.isUpperCase(s.charAt(i)))
                                resultado += " ";
                            resultado += Character.toLowerCase(s.charAt(i));
                        }
                    break;
                    
                    case 'M':
                        for(int i=4; i<s.length()-2; i++){
                            if(Character.isUpperCase(s.charAt(i)))
                                resultado += " ";
                            resultado += Character.toLowerCase(s.charAt(i));
                        }
                    break;
                    
                    case 'V':
                        for(int i=4; i<s.length(); i++){
                                if(Character.isUpperCase(s.charAt(i)))
                                    resultado += " ";
                                resultado += Character.toLowerCase(s.charAt(i));
                            }
                    break;
                }
                System.out.println(resultado);
            }
            
            if (s.charAt(0) == 'C'){
            
            boolean espacio=false;

                switch(s.charAt(2)){
                    case 'C':
                    resultado += Character.toUpperCase(s.charAt(4));
                        
                        for(int i=5; i<s.length(); i++){
                            if(s.charAt(i) == 32){
                                espacio = true;
                                continue;
                            }
                            if(espacio){
                                resultado += Character.toUpperCase(s.charAt(i));
                                espacio = false;
                                continue;
                            }
                            resultado += s.charAt(i);
                        }
                    break;
                    
                    case 'M':
                        for(int i=4; i<s.length(); i++){
                            if(s.charAt(i) == 32){
                                espacio = true;
                                continue;
                            }
                            if(espacio){
                                resultado += Character.toUpperCase(s.charAt(i));
                                espacio = false;
                                continue;
                            }
                            resultado += s.charAt(i);
                        }
                        resultado += "()";
                    break;
                    
                    case 'V':
                        for(int i=4; i<s.length(); i++){
                            if(s.charAt(i) == 32){
                                espacio = true;
                                continue;
                            }
                            if(espacio){
                                resultado += Character.toUpperCase(s.charAt(i));
                                espacio = false;
                                continue;
                            }
                            resultado += s.charAt(i);
                        }
                    break;
                }
                System.out.println(resultado);
            }
            
            
            
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        List <String> input = new ArrayList<>();
        
        System.out.println("ingrese el txt");

        for ( int i=0; i< 5; i++){
            input.add(sc.nextLine());
        }
        
        
        CamelCase s = new CamelCase();
        s.Result(input);
        
    }
}
