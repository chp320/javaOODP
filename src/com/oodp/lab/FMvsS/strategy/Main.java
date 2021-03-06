package com.oodp.lab.FMvsS.strategy;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account(12345678l, "Vijay Kumar", AccountType.SAVING);
        account1.setInterestStrategy(new CompoundInterestCalculator());
        account1.deposit(10000.0d);

        System.out.print(account1);
        System.out.println(" has interest : " + account1.getInterest(5));

        Account account2 = new Account(12345680l, "Jay Kumar", AccountType.SAVING);
        account2.setInterestStrategy(new SimpleInterestCalculator());
        account2.deposit(10000.0d);

        System.out.print(account2);
        System.out.println(" has interest : " + account2.getInterest(5));
    }
}
