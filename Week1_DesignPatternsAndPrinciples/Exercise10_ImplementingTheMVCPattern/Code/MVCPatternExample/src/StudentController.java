public class StudentController
{
    protected Student model;
    protected StudentView view;

    public StudentController(Student model, StudentView view)
    {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name)
    {
        model.name = name;
    }

    public void setStudentID(int id)
    {
        model.id = id;
    }

    public void setStudentGrade(String grade)
    {
        model.grade = grade;
    }

    public void updateView()
    {
        view.displayStudentDetails(model);
    }
}