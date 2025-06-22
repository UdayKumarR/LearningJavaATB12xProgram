package exam_12Xb_22062025_OOPsJava;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        System.out.print("Employee ID : ");
        return id;
    }

    public String getName() {
        System.out.print("Employee Name : ");
        return name;
    }

    public double getSalary() {
        System.out.print("Employee Salary : ");
        return salary;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee E1 = new Employee(1,"John Doe", 50000);
        System.out.print(E1.getId()+" ");
        System.out.print(E1.getName()+" ");
        System.out.print(E1.getSalary()+" ");
    }
}
