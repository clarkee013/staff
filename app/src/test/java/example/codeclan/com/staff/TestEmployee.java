package example.codeclan.com.staff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/06/2017.
 */

public class TestEmployee {

    Employee emp;

    @Before
    public void before(){
        emp = new Employee (7751864, "Bob", "JP423358D", 20000.00);
    }

    @Test
    public void canRaiseSalary(){
        emp.raiseSalary(10000.00);
        assertEquals(30000.00, emp.getSalary(),0.01);
    }

    @Test
    public void canSetName(){
        emp.setName("Alan Russ");
        assertEquals("Alan Russ", emp.getName());
    }

    @Test
    public void negativeSalary(){
        emp.raiseSalary(-10000);
        assertEquals(20000.00, emp.getSalary(), 0.01);
    }

    @Test
    public void noNoNull(){
        emp.setName(null);
        assertEquals("Bob", emp.getName());
    }

    @Test
    public void noEmptyString(){
        emp.setName("");
        assertEquals("Bob", emp.getName());
    }
}
