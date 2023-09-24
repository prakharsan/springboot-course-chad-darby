package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO{

    private String name;
    private String serviceCode;

    @Override
    public List<Account> findAccounts() {
        return findAccounts(false);
    }

    @Override
    public List<Account> findAccounts(boolean tripWire) {
        //simulating exception for academic purposes...
        if (tripWire) {
            throw new RuntimeException("No soup for you!!!");
        }

        List<Account> myAccounts = new ArrayList<Account>();
        Account account1 = new Account("Prakhar", "Silver");
        Account account2 = new Account("Adrija", "Platinum");
        Account account3 = new Account("Snehil", "Gold");
        myAccounts.add(account1);
        myAccounts.add(account2);
        myAccounts.add(account3);
        return myAccounts;
    }

    @Override
    public void addAccount(Account theAccount,  boolean vipFlag) {
        System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + " doWork()");
        return false;
    }

    public String getName() {
        System.out.println("This is getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println("This is setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println("This is getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println("This is setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
