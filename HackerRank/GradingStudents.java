import java.util.*;

public class GradingStudents {


    public List<Integer> gradingStudents(List<Integer> grades) {

        for(int i=0; i<grades.size(); i++){
            grades.set(i, round(grades.get(i)));
        }
        return grades;
        
    }

    public Integer round(Integer grade){

        if(grade > 38 && (5-(grade%5)) <3 )
            return grade + (5-(grade%5));
        return grade;
    }


    public static void main (String a []){

        GradingStudents g = new GradingStudents();
        List <Integer> list = new ArrayList<>();

        list.add(73);
        list.add(67);
        list.add(38);
        list.add(33);
        
        System.out.println(g.gradingStudents(list));

    }
}