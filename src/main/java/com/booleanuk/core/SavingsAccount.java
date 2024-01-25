package com.booleanuk.core;

public class SavingsAccount extends Account{
    private double overdraftAmount;

    public SavingsAccount(int accountId, Branch branch) {
        super(accountId, branch);
    }

    @Override
    public void withdraw(double amount) {
        double balance = this.getBalance();
        if(amount <= balance) {
            super.withdraw(amount);
        }
    }

    public void makeRequestForOverdraft(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    public double getRequestForOverDraft() {
        return this.overdraftAmount;
    }
}
