import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GradeService gradeService = new GradeService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student Grade");
            System.out.println("2. Calculate Average Grade");
            System.out.println("3. Get Highest Grade");
            System.out.println("4. Get Lowest Grade");
            System.out.println("5. View All Grades");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter student grade: ");
                    double grade = scanner.nextDouble();
                    gradeService.addStudent(name, grade);
                    System.out.println("Grade added successfully!");
                    break;
                case 2:
                    System.out.println("Average Grade: " + gradeService.calculateAverage());
                    break;
                case 3:
                    System.out.println("Highest Grade: " + gradeService.getHighestGrade());
                    break;
                case 4:
                    System.out.println("Lowest Grade: " + gradeService.getLowestGrade());
                    break;
                case 5:
                    System.out.println("All Grades:");
                    for (Student student : gradeService.getStudents()) {
                        System.out.println(student.getName() + ": " + student.getGrade());
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
