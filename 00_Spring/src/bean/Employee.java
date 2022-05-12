package bean;




public class Employee {
    private String name;
    private String gender;
    
    // 员工属于某一个部门，使用对象形式表示
    private Dept dept;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "name = " + name + ", gender = " + gender + ", dept = " + dept.toString();
    }
}
