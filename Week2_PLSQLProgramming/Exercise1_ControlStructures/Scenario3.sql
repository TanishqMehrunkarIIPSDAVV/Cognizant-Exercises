/*Exercise 1
Control Structures
Scenario 3*/

declare
  cursor loan_cursor is select * from LOANS
  where EndDate between SYSDATE and SYSDATE + 30;
  loan Loans%ROWTYPE;
begin
  for loan in loan_cursor loop
    dbms_output.put_line('Reminder: Customer ID ' || loan.CustomerID ||
      ' has a loan (Loan ID ' || loan.LoanID || 
      ') due on ' || TO_CHAR(loan.EndDate, 'DD-MON-YYYY') || 
      '. Please make the necessary payment.'
    );
  end loop;
end;
/