package example.codeclan.com.staff;

/**
 * Created by user on 20/06/2017.
 */

public class Manager extends Employee {
    public String deptName;

    public Manager(int EmpId, String name, String ssn, int salary, String deptName) {
        super(empId, name, ssn, salary)
        this.deptName = deptName;
    }

    public String getdeptName() {
        return deptName;
    }


}
