package com.io.github.pedroolivsz.classesAbstratas.application;

import com.io.github.pedroolivsz.classesAbstratas.entities.Account;
import com.io.github.pedroolivsz.classesAbstratas.entities.BusinessAccount;
import com.io.github.pedroolivsz.classesAbstratas.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount(1002, "Maria", 1000.0, 0.1);
        Account acc2 = new BusinessAccount(1002, "Bob", 1000.0, 500.0);
        Account acc3 = new SavingsAccount(1003, "Vardil", 678.0, 0.3);
        Account acc4 = new BusinessAccount(1004, "Ted", 1090., 500.0);

        List<Account> list = new ArrayList<>();

        list.add(acc1);
        list.add(acc2);
        list.add(acc3);
        list.add(acc4);

        double sum = 0.0;

        for(Account account : list) {
            sum += account.getBalance();
        }

        System.out.printf("Total balance -> %.2f", sum);

        for(Account account : list) {
            account.deposit(10.0);
        }

        sum = 0.0;

        for(Account account : list) {
            sum += account.getBalance();
        }

        System.out.printf("\nTotal balance -> %.2f", sum);
    }
}
