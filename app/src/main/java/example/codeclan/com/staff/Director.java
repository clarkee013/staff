package example.codeclan.com.staff;

/**
 * Created by user on 20/06/2017.
 */

public class Director extends Manager {
    private double budget;

    public Manager(int EmpId, String name, String ssn, int salary, String deptName, double budget) {
        super(empId, name, ssn, salary, deptName)
        this.budget = budget;
    }

    private double getBudget() {
        return budget;
    }


}
