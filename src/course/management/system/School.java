package course.management.system;

import java.util.List;

/**
 *
 * Keeps track the teachers salaries and students fees
 * Keeps track of the total money spent and collected by the school
 * Uses ArrayList*/
    public class School {

    private List<Professor> professors; // An ArrayList that will contain a list of Professors
    private List<Student> students; //  An Array list containing a list of students
    private int totalMoneyCollected;
    private int totalMoneySpent;


    /**
     * school object is created- takes a list of students and professors
     * @param professors
     * @param students
     */
    public School(List<Professor> professors, List<Student> students) {
        this.professors = professors;
        this.students = students;
        totalMoneyCollected = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return a professor object from the list of Professor objects
     */
    public List<Professor> getProfessor() {
        return professors;
    }

    /**
     * Adds a professor to the school
     */
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    /**
     * Returns the students in the Students list
     * @return
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds an additional student to the list of students
     * @param student
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total amount collected from the students paid tuition
     */
    public int getTotalMoneyCollected() {
        return totalMoneyCollected;
    }

    /**
     * Sets the total amount collected
     * @param totalMoneyCollected
     */
    public void setTotalMoneyCollected(int totalMoneyCollected) {
        this.totalMoneyCollected = totalMoneyCollected;
    }

    /**
     * Returns the total money spent by the school in the form of salary to the professors
     * @return
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Updates the total money to be spent/ paid out, by the school
     * @param moneySpent salary given to the professors
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneyCollected -= moneySpent;
    }
}
