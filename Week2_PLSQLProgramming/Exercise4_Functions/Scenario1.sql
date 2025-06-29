/*Exercise 4
Functions
Scenario 1*/

create or replace function CalculateAge(
  db in Customers.DOB%type
)
return Number
is
years_old Number;
begin
  years_old := TRUNC(MONTHS_BETWEEN(SYSDATE, db) / 12);
  return years_old;
end;
/