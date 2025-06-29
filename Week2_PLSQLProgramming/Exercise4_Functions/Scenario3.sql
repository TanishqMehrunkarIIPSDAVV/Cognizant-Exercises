/*Exercise 4
Functions
Scenario 3*/

create or replace function HasSufficientBalance(
  accid in Accounts.AccountID%type,
  amt in Accounts.Balance%type
)
return boolean
is
  acc_amt Accounts.Balance%type;
begin
  select Balance into acc_amt from Accounts where AccountID = accid;
  if acc_amt < amt then
    return FALSE;
  else
    return TRUE;
  end if;
end;
/