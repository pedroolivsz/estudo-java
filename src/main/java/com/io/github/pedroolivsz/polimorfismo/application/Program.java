package com.io.github.pedroolivsz.polimorfismo.application;

import com.io.github.pedroolivsz.polimorfismo.entities.Employee;
import com.io.github.pedroolivsz.polimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int n = scan.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Employee Nº " + (i+1) + "data:");
            System.out.print("Outsourced? (y/n)?");
            char confirm = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Hours: ");
            int hours = scan.nextInt();
            System.out.print("Value per hours: ");
            double vph = scan.nextDouble();

            if(confirm == 'y') {
                System.out.println("Additional charge: ");
                double addc = scan.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, vph, addc));
            } else {
                employees.add(new Employee(name, hours, vph));
            }
        }

        System.out.println();
        System.out.println("Payments:");

        for(Employee employee : employees) {
            System.out.printf("%s - $ %.2f \n", employee.getName(), employee.payment());
        }

        scan.close();
    }
}
