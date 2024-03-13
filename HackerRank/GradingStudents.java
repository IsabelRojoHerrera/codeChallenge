import java.util.*;

public class GradingStudents {


    public List<Integer> gradingStudents(List<Integer> grades) {


        for(int i=0; i<grades.size(); i++){
            grades.set(i, round(grades.get(i)));
        }
    
        return grades;

    }

    public Integer round(Integer grade){

        if(grade % 5 <3 )
            return grade + (grade%5);

        return grade;
    }


    public static void main (String a []){

    }
}