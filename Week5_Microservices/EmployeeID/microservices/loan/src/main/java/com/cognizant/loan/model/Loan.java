package com.cognizant.loan.model;

public class Loan
{
    private String number;
    private String type;
    private double loan;
    private double emi;
    private int tenure;

    public Loan(String number,String type,double loan,double emi,int tenure)
    {
        this.number = number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setLoan(double loan)
    {
        this.loan = loan;
    }

    public void setEMI(double emi)
    {
        this.emi = emi;
    }

    public void setTenure(int tenure)
    {
        this.tenure = tenure;
    }

    public String getNumber()
    {
        return this.number;
    }

    public String getType()
    {
        return this.type;
    }

    public double getLoan()
    {
        return this.loan;
    }

    public double getEMI()
    {
        return this.emi;
    }
    
    public int getTenure()
    {
        return this.tenure;
    }
}