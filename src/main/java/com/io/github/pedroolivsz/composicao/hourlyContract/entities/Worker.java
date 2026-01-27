package com.io.github.pedroolivsz.composicao.hourlyContract.entities;

import com.io.github.pedroolivsz.composicao.hourlyContract.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Depatment depatment;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Depatment depatment) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.depatment = depatment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Depatment getDepatment() {
        return depatment;
    }

    public void setDepatment(Depatment depatment) {
        this.depatment = depatment;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();

        for(HourContract contract : contracts) {
            calendar.setTime(contract.getDate());

            int yearContract = calendar.get(Calendar.YEAR);
            int monthContract = 1 + calendar.get(Calendar.MONTH);

            if(yearContract == year && monthContract == month) {
                sum += contract.totalValue();
            }
        }

        return sum;
    }
}
