/*Exercise 1
Control Structures
Scenario 1*/

declare
customer Customers%ROWTYPE;  
years_old NUMBER;
cursor customer_cursor is select * from Customers;
begin
  open customer_cursor;
  loop
    fetch customer_cursor into customer;
    exit when customer_cursor%notfound;
    years_old := TRUNC(MONTHS_BETWEEN(SYSDATE, customer.DOB) / 12);
    if years_old > 60 then
      update Loans set InterestRate = InterestRate - (InterestRate * 0.01) where CustomerID = customer.CustomerID;
    end if;
  end loop;
  close customer_cursor;
end;
/