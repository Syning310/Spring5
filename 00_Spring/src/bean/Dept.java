package bean;

import java.util.List;

public class Dept {
    
    private String name;
    
    // 一个部门有多个员工
    List<Employee> empList;
    
    
    
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "name = " + name; 
    }
}
