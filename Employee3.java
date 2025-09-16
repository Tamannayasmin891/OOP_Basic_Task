import java.time.LocalDate;
import java.time.Period;

class Employee2 {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee2(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int getYearsOfService() {

        LocalDate referenceDate = LocalDate.of(2023, 4, 1);
        return Period.between(hireDate, referenceDate).getYears();
    }

    public String toString() {
        return "Name: " + name + "\nSalary: " + salary +
                "\nHireDate: " + hireDate +
                "\nYears of Service: " + getYearsOfService() + "\n";
    }
}

public class Employee3 {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2("Roberta Petrus", 50000, LocalDate.of(2021, 4, 1));
        Employee2 e2 = new Employee2("Loyd Blair", 70000, LocalDate.of(2015, 4, 1));
        Employee2 e3 = new Employee2("Magdalena Artemon", 50000, LocalDate.of(2011, 1, 15));

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
