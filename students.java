import java.util.Scanner;
//solomon mwangi ct101/g/20741/23
class Student {
    private String name;
    private int age;
    private double marks;
    private String grade; // Added grade attribute to Student class

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        calculateGrade(); // Calculate grade during object creation
    }

    public Student(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    private void calculateGrade() {
        if (marks >= 70 && marks <= 100) { 
            grade = "A"; 
        } else if (marks >= 50 && marks < 70) { 
            grade = "B"; 
        } else { 
            grade = "C"; 
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class students {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter the age: ");
            int age = scanner.nextInt();
            
            System.out.print("Enter the marks: ");
            double marks = scanner.nextDouble();
            
            Student student = new Student(name, age, marks);
            student.displayDetails();
        }
    }
}

