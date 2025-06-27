/*Exercise 3
Stored Procedures
Scenario 1*/

create or replace procedure ProcessMonthlyInterest is
begin
  update Accounts
  set Balance = Balance + (Balance * 0.01), LastModified = SYSDATE
  where AccountType = 'Savings';
end;
/