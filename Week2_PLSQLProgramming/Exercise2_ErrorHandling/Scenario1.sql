/*Exercise 2
Error Handling
Scenario 1*/

create or replace procedure SafeTransferFunds(
  amt in Customers.Balance%type,
  cid1 in Customers.CustomerID%type,
  cid2 in Customers.CustomerID%type
)
is
  camt1 Customers.Balance%type;
begin
  savepoint starting_transfer;
  select Balance into camt1 from Customers where CustomerID = cid1;
  if camt1 < amt then
    raise_application_error(-20001,'Insufficient Balance!!!');
  else
    update Customers set Balance = Balance + amt, LastModified = SYSDATE where CustomerID = cid2;
    update Customers set Balance = Balance - amt, LastModified = SYSDATE where CustomerID = cid1;
    update Accounts set Balance = Balance + amt, LastModified = SYSDATE where CustomerID = cid2;
    update Accounts set Balance = Balance - amt, LastModified = SYSDATE where CustomerID = cid1;
    commit;
  end if;
exception
  when OTHERS then
    rollback to starting_transfer;
    raise_application_error(-20001,'Error: ' || SQLERRM);
end;
/