package course.management.system;

public class Student {
    private int studentId;
    private String name;
    private int academicYear;
    private int tuitionPaid;
    private int tuitionTotal;
    private int newTuitionTotal;

    /**
     * Instantiates a Student object
     * Default student tuition is $15000
     * Default tuition paid is $0
     * @param studentId unique value for each student
     * @param name      name of the student
     * @param academicYear represented by variable
     */
    public Student(int studentId, String name, int academicYear) {
        this.tuitionPaid = 0;
        this.tuitionTotal = 15000;
        this.newTuitionTotal = tuitionTotal;
        this.studentId = studentId;
        this.name = name;
        this.academicYear = academicYear;

        if(academicYear > 2) {
            newTuitionTotal = tuitionTotal * academicYear;
        }


    }

    //Students name and ID should not be changed

    /**
     * Updates the total tuition paid by each student
     * @param tuition
     */
    public void payTuition(int tuition) {
        tuitionPaid += tuition;
    }

    /**
     * Returns the students unique id
     * @return
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     *
     * Returns the student's name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the total tuition paid by the
     * @return
     */
    public int getTuitionPaid() {
        return tuitionPaid;
    }

    /**
     * Reurns the total tuition that the student owes
     * @return
     */
    public int getNewTuitionTotal() {
        return newTuitionTotal;
    }

}
