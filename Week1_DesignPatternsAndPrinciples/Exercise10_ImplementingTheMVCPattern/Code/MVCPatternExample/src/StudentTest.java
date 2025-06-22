public class StudentTest
{
    public static void main(String[] args)
    {
        Student student = new Student(0, "XYZ", "A++");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentID(1);
        controller.setStudentName("ABC");
        controller.setStudentGrade("A-");

        controller.updateView();
    }
}