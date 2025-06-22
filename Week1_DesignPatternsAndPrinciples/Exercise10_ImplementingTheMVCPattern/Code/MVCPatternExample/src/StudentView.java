public class StudentView
{
    public void displayStudentDetails(Student student)
    {
        System.out.println("Student Details: ");
        System.out.println("ID:  "+student.id+", Name: "+student.name+", Grade: "+student.grade);
    }
}