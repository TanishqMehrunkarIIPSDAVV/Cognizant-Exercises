/*Exercise 3
Stored Procedures
Scenario 3*/

create or replace procedure TransferFunds(
  amt in Customers.Balance%type,
  cid1 in Customers.CustomerID%type,
  cid2 in Customers.CustomerID%type
)
is
  camt1 Customers.Balance%type;
begin
  select Balance into camt1 from Customers where CustomerID = cid1;
  if camt1 < amt then
    raise_application_error(-20001,'Insufficient Balance!!!');
  else
    update Customers set Balance = Balance + amt where CustomerID = cid2;
    update Customers set Balance = Balance - amt where CustomerID = cid1;
    update Accounts set Balance = Balance + amt where CustomerID = cid2;
    update Accounts set Balance = Balance - amt where CustomerID = cid1;
    commit;
    dbms_output.put_line('Transfer successful.');
  end if;
exception
  when NO_DATA_FOUND then
    raise_application_error(-20001,'One or both CustomerIDs do not exist.');
  when OTHERS then
    raise_application_error(-20001,'Error: ' || SQLERRM);
end;
/