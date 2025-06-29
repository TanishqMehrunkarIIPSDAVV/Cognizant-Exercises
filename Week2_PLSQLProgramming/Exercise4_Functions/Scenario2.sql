/*Exercise 4
Functions
Scenario 2*/

create or replace function CalculateMonthlyInstallment(
  loan_amount in Loans.LoanAmount%type,
  interest in Loans.InterestRate%type,
  years in Number
)
return Number
is
installment Number;
monthly_rate NUMBER;
months NUMBER;
begin
  monthly_rate := interest/12/100;
  months := years*12;
  installment := (loan_amount * monthly_rate * POWER(1 + monthly_rate, months)) /
    (POWER(1 + monthly_rate, months) - 1);
  return installment;
end;
/