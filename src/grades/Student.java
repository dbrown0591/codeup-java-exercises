package grades;

import java.util.ArrayList;

public class Student {

    private ArrayList<Integer> grades;
    private String name;

    public Student(String name) {
        grades = new ArrayList <>();
        this.name = name;
    }

    // returns the student's name

    public String getName() {

        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){

        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int totalGrades = 0;
        for(int i = 0; i < grades.size(); i++) {
            totalGrades += grades.get(i);
        }
        return totalGrades/grades.size();
    }

    public static void main(String[] args){
        Student st = new Student("Joe");
            st.addGrade(95);
            st.addGrade(85);
            st.addGrade(75);
            st.addGrade(80);
            st.addGrade(55);
            st.getName();
            st.getGradeAverage();
        System.out.println(st.getName());
        System.out.println(st.getGradeAverage());

    }
}
