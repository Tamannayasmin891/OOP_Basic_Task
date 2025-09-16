import java.util.*;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    public String toString() {
        return "Name: " + name + "\nGrade: " + grade;
    }
}

public class Student2 {
    public static void main(String[] args) {
        Student s1 = new Student("Carolus Vitali", 11);
        Student s2 = new Student("Nakeisha Uhuru", 10);
        Student s3 = new Student("Gabriella Cherice", 10);

        System.out.println("Student Details:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Adding courses for Carolus Vitali");
        s1.addCourse("Math");
        s1.addCourse("Science");
        s1.addCourse("English");
        System.out.println("Carolus Vitali's courses: " + s1.getCourses());

        System.out.println("\nAdding courses for Nakeisha Uhuru");
        s2.addCourse("History");
        s2.addCourse("Geography");
        s2.addCourse("English");
        System.out.println("Nakeisha Uhuru's courses: " + s2.getCourses());

        System.out.println("\nRemoving 'Science' course for Carolus Vitali");
        s1.removeCourse("Science");
        System.out.println("Carolus Vitali's courses: " + s1.getCourses());
    }
}
