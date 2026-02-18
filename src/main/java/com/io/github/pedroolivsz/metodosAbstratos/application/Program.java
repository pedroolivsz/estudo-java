package com.io.github.pedroolivsz.metodosAbstratos.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of shapes: ");
        int n = scan.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.printf("Shape Nº %d data: ", i);

        }

    }
}