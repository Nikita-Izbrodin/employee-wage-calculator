package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        boolean loop = true;

        while (loop) {

            //name
            System.out.println("What is your name?");
            String name;
            double overtimeHours = 0;
            name = input.next();

            //hours worked
            System.out.println("How many hours have you worked this week?");
            double hoursWorked;
            hoursWorked = input.nextInt();

            //hourly wage of the employee
            System.out.println("What is your hourly wage?");
            double wage;
            wage = input.nextInt();

            //if worked more than 45 hours that week then do overtime pay
            if (hoursWorked > 45) {

                overtimeHours = hoursWorked - 45;
                hoursWorked = 45;

            } else {

            }
            double pay = (hoursWorked*wage)+(overtimeHours*(wage*1.5));
            double tax = pay*0.2;
            System.out.println(name + ": You should get £" + pay);
            System.out.println(name + ": Before paying tax: £" + pay + "    After paying tax £" + (pay-tax));
    }
    }
}
