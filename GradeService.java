import java.util.ArrayList;
import java.util.List;

public class GradeService {
    private List<Student> students;

    public GradeService() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, double grade) {
        students.add(new Student(name, grade));
    }

    public double calculateAverage() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return students.size() == 0 ? 0 : sum / students.size();
    }

    public double getHighestGrade() {
        double highest = Double.MIN_VALUE;
        for (Student student : students) {
            if (student.getGrade() > highest) {
                highest = student.getGrade();
            }
        }
        return highest == Double.MIN_VALUE ? 0 : highest;
    }

    public double getLowestGrade() {
        double lowest = Double.MAX_VALUE;
        for (Student student : students) {
            if (student.getGrade() < lowest) {
                lowest = student.getGrade();
            }
        }
        return lowest == Double.MAX_VALUE ? 0 : lowest;
    }

    public List<Student> getStudents() {
        return students;
    }
}

