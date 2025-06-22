package exam_12Xb_22062025_OOPsJava;

public class exam7_empHierarchySalCal {
    public static void main(String[] args) {
        employee manager = new Manager();
        employee dev = new Developer();
        manager.calSal();
        dev.calSal();
    }
}

class employee{
    public void calSal()
    {
        System.out.println("Salary for employees vary based on role");
    }
}

class Manager extends employee{
    double baseSal = 60000;
    double bonus = 10000;
    public void calSal(){
        System.out.print("Manager Salary: " + (baseSal+bonus));
        System.out.print(" ");
    }
}

class Developer extends employee{
    double hourlyRate = 50;
    double hours = 160;
        public void calSal() {
        System.out.print("Developer Salary: " + (hourlyRate*hours));
        System.out.print(" ");
    }
}
