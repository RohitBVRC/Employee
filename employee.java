class Employee{
    private int id;
    private String ename;
    private double salary;
    private String designation;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    
}











public class Main {
    
public static void main(String[] args) {
        Employee emp=new Employeemployee();
        emp.setId(100);
        emp.setEname("Ramu");
        emp.setSalary(50000.25);
        emp.setDesignation("mtech");

        System.out.println(emp.getId());
        System.out.println(emp.getEname());
        System.out.println(emp.getSalary());
        System.out.println(emp.getDesignation());
    }
}
