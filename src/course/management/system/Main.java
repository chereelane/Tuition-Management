package course.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Adding professors
        Professor marge = new Professor(01, "marge", 360 );              // $45/hr
        Professor tyler = new Professor(02, "tyler", 256);               // $32/hr
        Professor charlotte = new Professor(03,"charlotte",288);         // $36/hr

        // Create list of Professors
        List<Professor> professorList = new ArrayList<>();
        professorList.add(tyler);
        professorList.add(marge);
        professorList.add(charlotte);

        // Adding Students
        Student lily = new Student(001, "lily", 4);
        Student rose = new Student(002,"rose", 1);
        Student daisy = new Student(003, "daisy", 3);
        Student amaryllis = new Student(003, "amaryllis", 3);
        Student calathea = new Student(003, "amaryllis", 4);

        // Create list of Students
        List<Student> studentList =  new ArrayList<>();
        studentList.add(lily);
        studentList.add(rose);
        studentList.add(daisy);
        studentList.add(amaryllis);
        studentList.add(calathea);

        School newSchool = new School(professorList, studentList);
        System.out.println(newSchool.getTotalMoneyCollected());

        System.out.println(daisy.getNewTuitionTotal());




    }
}
