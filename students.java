import java.util.Scanner;
// Solomon Mwangi CT101/G/20741/23
class Student {
    private String name;
    private int age;
    private double marks;
    private String grade; // Added grade attribute to store the student's grade

    // Constructor to initialize the student's name, age, and marks
    // Automatically calculates the grade when the student object is created
    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        calculateGrade(); // Automatically assign grade based on marks
    }

    // Constructor for creating a student with just a name (no age or marks provided)
    public Student(String name) {
        this.name = name;
    }

    // Method to display the student's details (name, age, marks, and grade)
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    // Private method to calculate the grade based on the student's marks
    // Grade 'A' for marks 70-100, 'B' for marks 50-69, and 'C' for below 50
    private void calculateGrade() {
        if (marks >= 70 && marks <= 100) { 
            grade = "A"; // Excellent performance
        } else if (marks >= 50 && marks < 70) { 
            grade = "B"; // Good performance
        } else { 
            grade = "C"; // Needs improvement
        }
    }

    // Getter for the student's name
    public String getName() {
        return name;
    }

    // Setter to update the student's name
    public void setName(String name) {
        this.name = name;
    }
}

public class students {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the student's name
            System.out.print("Enter the name: ");
            String name = scanner.nextLine();
            
            // Prompt the user to enter the student's age
            System.out.print("Enter the age: ");
            int age = scanner.nextInt();
            
            // Prompt the user to enter the student's marks
            System.out.print("Enter the marks: ");
            double marks = scanner.nextDouble();
            
            // Create a new Student object with the provided details
            Student student = new Student(name, age, marks);
            
            // Display the student's details (name, age, marks, and grade)
            student.displayDetails();
        }
    }
}
