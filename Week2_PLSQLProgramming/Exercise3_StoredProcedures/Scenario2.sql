/*Exercise 3
Stored Procedures
Scenario 2*/

create or replace procedure UpdateEmployeeBonus(
  bonus in Number,
  department_name in Employees.Department%type
)
is
begin
  update Employees set Salary = Salary + (Salary * (bonus/100))
  where Department = department_name;
end;
/