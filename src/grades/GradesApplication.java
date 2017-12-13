package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();
        System.out.println("Wlecome to my grades application!");

        Student d1 = new Student("Damion");
            d1.addGrade(95);
            d1.addGrade(55);
            d1.addGrade(64);
        Student d2 = new Student("Floyd");
            d2.addGrade(78);
            d2.addGrade(88);
            d2.addGrade(79);
        Student d3 = new Student("Po");
            d3.addGrade(65);
            d3.addGrade(93);
            d3.addGrade(46);
        Student d4 = new Student("Washington");
            d4.addGrade(73);
            d4.addGrade(85);
            d4.addGrade(77);


            students.put("dbrown0591", d1);
            students.put("FloydMoore4",d2);
            students.put("PoSeqoia12", d3);
            students.put("Washington1245", d4);
    }


}
