package com.io.github.pedroolivsz.heranca.bank.entities;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
    }

    @Override
    public void deposit(Double amount) {
        super.deposit(amount);
    }

    public void loan(Double amount) {
        if(amount <= loanLimit) {
            deposit(amount);
        }
    }

    public Double getLoanLimit() {
        return loanLimit;
    }
}
