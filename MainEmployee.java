class Employee {
    String name, jobTitle;
    double salary;

    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void raiseSalary(double percent) {
        salary += salary * percent / 100;
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
        Employee e2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);

        System.out.println("Employee Details:");
        e1.printInfo();
        e2.printInfo();

        System.out.println("\nAfter raising salary:");
        e1.raiseSalary(8);
        e2.raiseSalary(12);

        System.out.println("8% for '" + e1.name + "':");
        e1.printInfo();
        System.out.println("12% for '" + e2.name + "':");
        e2.printInfo();
    }
}
