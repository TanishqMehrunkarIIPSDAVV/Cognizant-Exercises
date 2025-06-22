import java.util.ArrayList;

public class EmployeeTest
{
    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(int id,String name,String position,double salary)
    {
        this.employees.add(new Employee(id, name, position, salary));
        System.out.println("Employee Added Successfully!!!");
    }

    public void searchEmployee(int id)
    {
        int flag = 0;
        for(Employee emp: this.employees)
        {
            if(emp.employeeID == id)
            {
                System.out.println("Searched Employee:");
                System.out.println("ID: "+emp.employeeID+", Name: "+emp.employeeName+", Position: "+emp.employeePosition+", Salary: "+emp.employeeSalary);
                flag = 1;
            }
        }
        if(flag==0) System.out.println("Couldn't find employee with this id!!!");
    }

    public void displayEmployees()
    {
        System.out.println("Employees:");
        for(Employee emp:this.employees)
        {
            System.out.println("ID: "+emp.employeeID+", Name: "+emp.employeeName+", Position: "+emp.employeePosition+", Salary: "+emp.employeeSalary);
        }
    }

    public void deleteEmployee(int id)
    {
        this.employees.removeIf((emp)->(emp.employeeID == id));
        System.out.println("Employee with ID: "+id+" deleted successfully!!!");
    }

    public static void main(String[] args)
    {
        EmployeeTest test = new EmployeeTest();
        test.addEmployee(1, "ABC", "Manager", 70000);
        test.addEmployee(2, "XYZ", "Developer", 50000);
        test.addEmployee(3, "PQR", "Designer", 40000);
        test.addEmployee(4, "DEF", "Developer", 50000);

        test.displayEmployees();

        test.searchEmployee(3);

        test.deleteEmployee(3);

        test.displayEmployees();
    }
}