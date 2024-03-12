package Sparse_Arrays;
import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        List<String> queries = new ArrayList<>();
        

        try {
            File s = new File("/workspace/codeChallenge/HackerRank/Sparse_Arrays/strings.txt");
            s.setReadable(true);
            Scanner ss = new Scanner(s);

            while (ss.hasNextLine()) {
                strings.add(ss.nextLine());
            }

            File q = new File("/workspace/codeChallenge/HackerRank/Sparse_Arrays/queries.txt");
            q.setReadable(true);
            Scanner sq = new Scanner(q);

            while (sq.hasNextLine()) {
                queries.add(sq.nextLine());
            }


            Result re = new Result();
            List<Integer> resultado = re.matchingStrings(strings, queries);

            for(int i=0; i<resultado.size();i++ ){
                System.out.println(resultado.get(i));
                
            }

            

    
        ss.close();
        sq.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no fue encontrado.");
            e.printStackTrace();
        }

    }

}