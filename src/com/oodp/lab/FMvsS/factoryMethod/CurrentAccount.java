package com.oodp.lab.FMvsS.factoryMethod;

public class CurrentAccount extends Account {

    public CurrentAccount(long accountNo, String accountHolderName) {
        super(accountNo, accountHolderName, AccountType.CURRENT);
        setInterestStrategy("Simple Interest");
    }

    @Override
    public double getInterest(int term) {
        if (this.getAccountType() != null) {
            return (this.getAmount() * term * this.getAccountType().getRate()) / 100.0d;
        }
        return 0.0d;
    }
}
