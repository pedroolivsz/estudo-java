package com.io.github.pedroolivsz.classesAbstratas.entities;

public class BusinessAccount extends Account {
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
        balance -= 2.0;
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
