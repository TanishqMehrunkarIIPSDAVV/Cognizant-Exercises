/*Exercise 1
Control Structures
Scenario 2*/

declare
customer Customers%ROWTYPE;
isVIP boolean := false;
begin
  for customer in (select * from Customers) loop
    if customer.Balance > 10000 then
      isVIP := true;
      dbms_output.put_line('Customer with ID: ' || customer.CustomerID || ' is a VIP');
    end if;
  end loop;
end;
/