package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SalesEmployee extends Employee {
    @JsonProperty
    private String name;
    @JsonProperty
    private String nationalInsurance;
    @JsonProperty
    private int bankAccountNo;
    @JsonProperty
    private double salary;
    @JsonProperty
    private double commissionRate;

    public SalesEmployee(String name, String nationalInsurance, int bankAccountNo, double salary, double commissionRate) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.bankAccountNo = bankAccountNo;
        this.salary = salary;
        this.commissionRate = commissionRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public void setNationalInsurance(String nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }

    public int getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(int bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
