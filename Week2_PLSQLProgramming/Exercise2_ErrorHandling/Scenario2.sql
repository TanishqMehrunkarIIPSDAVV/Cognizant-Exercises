/*Exercise 2
Error Handling
Scenario 2*/

create or replace procedure UpdateSalary(
  bonus in Number,
  empid in Employees.EmployeeID%type
)
is
begin
  update Employees set Salary = Salary + (Salary * (bonus/100))
  where EmployeeID = empid;
  if SQL%ROWCOUNT = 0 then
    raise NO_DATA_FOUND;
  end if;
exception
  when NO_DATA_FOUND then
    raise_application_error(-20001,'Employee ID Not Found!!!');
end;
/