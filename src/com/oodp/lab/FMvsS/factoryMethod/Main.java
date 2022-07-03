package com.oodp.lab.FMvsS.factoryMethod;

public class Main {

    public static void main(String[] args) {
        AccountFactory factory = new AccountFactory();
        Account account1 = factory.createAccount(12345678l, "Vijay Kumar", "SAVING");
        account1.deposit(10000.0d);

        System.out.print(account1);
        System.out.println(" has interest : " + account1.getInterest(5));

        Account account2 = factory.createAccount(12345680l, "Jay Kumar", "CURRENT");
        account2.deposit(10000.0d);

        System.out.print(account2);
        System.out.println(" has interest : " + account2.getInterest(5));
    }
}
