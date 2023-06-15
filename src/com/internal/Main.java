package com.internal;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
        /**
         * @param args
         */
        public static void main(String[] args) {
                final byte MONTHS_IN_YEAR = 12;
                final byte PERCENT = 100;

                Scanner scanner = new Scanner(System.in);

                System.out.print("Principle: ");
                int principal = scanner.nextInt();

                System.out.print("Annual Interest Rate: ");
                float annualinterest = scanner.nextFloat();
                float monthlyInterest = annualinterest / PERCENT / MONTHS_IN_YEAR;
                // a statement is a piece of code that produces a result.
                // r(1+r)^n
                System.out.print("Period (Years): ");
                int years = scanner.nextByte();
                int numberOfPayments = years * MONTHS_IN_YEAR;

                double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

                String formatedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

                System.out.println("Mortgage: " + formatedMortgage);
                scanner.close();
        }
}
