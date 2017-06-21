package example.codeclan.com.staff;

/**
 * Created by user on 20/06/2017.
 */

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null || name != ""){
        this.name = name;
        }
    }

    public double getSalary() {
        return salary;
    }

    public String getSsn() {
        return ssn;
    }

    public void raiseSalary(double amount) {
        if (amount >= 0) {
            salary += amount;
        }
    }


}

