package com.io.github.pedroolivsz.tratamentoDeExcecoes.model.application;

import com.io.github.pedroolivsz.tratamentoDeExcecoes.model.entitiy.Reservation;
import com.io.github.pedroolivsz.tratamentoDeExcecoes.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = scan.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = dateFormat.parse(scan.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = dateFormat.parse(scan.next());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);

            System.out.println("Reservation: " + reservation);

            System.out.println();

            System.out.println("Enter data to update reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = dateFormat.parse(scan.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = dateFormat.parse(scan.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        scan.close();
    }
}
