/*Exercise 2
Error Handling
Scenario 3*/

create or replace procedure AddNewCustomer(
  cid in Customers.CustomerID%type,
  cname in Customers.Name%type,
  birth in Customers.DOB%type,
  bal in Customers.Balance%type
)
is
begin
  insert into Customers(CustomerID, Name, DOB, Balance, LastModified)
  values(cid, cname, birth, bal, SYSDATE);
exception
  when DUP_VAL_ON_INDEX then
    raise_application_error(-20001,'Customer ID Already Present!!!');
end;
/