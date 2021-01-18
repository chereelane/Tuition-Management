package course.management.system;

/**
 * This class keeps track of professor information
 */
public class Professor {
    private int professorId;
    private String name;
    private int salary;

    /**
     * Creates a Professor object that specified the professor id, name, and salary
     * @param professorId unique Id assigned to each professor
     * @param name      name of the professot
     * @param salary amount of money the professor makes per day
     */
    public Professor(int professorId, String name, int salary) {
        this.professorId = professorId;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Returns the professor unique ID
     * @return
     */
    public int getProfessorId() {
        return professorId;
    }

    /**
     * Returns the name of the professor
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets salary for the professor
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Returns the professor salary
     * @return
     */
    public int getSalary() {
        return salary;
    }
}


