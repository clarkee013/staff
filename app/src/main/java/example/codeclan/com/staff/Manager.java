package example.codeclan.com.staff;

/**
 * Created by user on 20/06/2017.
 */

public class Manager extends Employee {

    private String deptName;

    public Manager(String deptName) {
        this.deptName = deptName;
    }

    public String getdeptName() {
        return deptName;
    }


}
