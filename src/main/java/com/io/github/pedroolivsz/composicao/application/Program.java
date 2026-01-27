package com.io.github.pedroolivsz.composicao.application;

import com.io.github.pedroolivsz.composicao.entities.Depatment;
import com.io.github.pedroolivsz.composicao.entities.HourContract;
import com.io.github.pedroolivsz.composicao.entities.Worker;
import com.io.github.pedroolivsz.composicao.entities.enums.WorkerLevel;

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String departamentName = JOptionPane.showInputDialog(null, "Name: ", "Enter departament's data", JOptionPane.PLAIN_MESSAGE);
        String workerName = JOptionPane.showInputDialog(null, "Name: ", "Enter woker data", JOptionPane.PLAIN_MESSAGE);
        WorkerLevel workerLevel = WorkerLevel.valueOf(JOptionPane.showInputDialog(null, "Level: ", "Enter woker data", JOptionPane.PLAIN_MESSAGE));
        Double baseSalary = Double.valueOf(JOptionPane.showInputDialog(null, "Base salary: ", "Enter woker data", JOptionPane.PLAIN_MESSAGE));
        Worker worker = new Worker(workerName, workerLevel, baseSalary, new Depatment(departamentName));

        int numberContracts = Integer.parseInt(JOptionPane.showInputDialog(null, "How many contracts to this worker? "));

        for(int i = 0; i < numberContracts; i++) {
            String date = JOptionPane.showInputDialog(null, "Date (DD/MM/YYYY): ", "Enter contract #" + i+1 + " data", JOptionPane.PLAIN_MESSAGE);
            Date contractDate = simpleDateFormat.parse(date);
            double valuePerHour = Double.parseDouble(JOptionPane.showInputDialog(null, "Value per hour: ", "Enter contract #" + i+1 + " data", JOptionPane.PLAIN_MESSAGE));
            int hour = Integer.parseInt(JOptionPane.showInputDialog(null, "Duration (hour): ", "Enter contract #" + i+1 + " data", JOptionPane.PLAIN_MESSAGE));

            HourContract contract = new HourContract(contractDate, valuePerHour, hour);

            worker.addContract(contract);
        }

        String monthAndYear = JOptionPane.showInputDialog(null, "Enter month and year to calculate income (MM/YYYY): ", "Calculate income", JOptionPane.PLAIN_MESSAGE);

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        String informationWorker = """
                Name: %s
                Department: %s
                Income for %s: %.2f
                """.formatted(worker.getName(), worker.getDepatment().getName(), monthAndYear, worker.income(year, month));

        JOptionPane.showMessageDialog(null, informationWorker, "Information for the worker", JOptionPane.PLAIN_MESSAGE);
    }
}
