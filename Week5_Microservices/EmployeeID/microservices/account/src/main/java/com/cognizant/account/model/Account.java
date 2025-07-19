package com.cognizant.account.model;

public class Account
{
    private String number;
    private String type;
    private double balance;

    public Account(String number,String type,double balance)
    {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getNumber()
    {
        return this.number;
    }

    public String getType()
    {
        return this.type;
    }

    public double getBalance()
    {
        return this.balance;
    }


}