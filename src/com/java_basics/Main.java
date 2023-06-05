package com.java_basics;

import java.util.Scanner;

public class Main {
        /**
         * @param args
         */
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Principle: ");

                int prncAmnt = scanner.nextByte();
                System.out.print("Annual Interest Rate: ");
                
                // divide by 100 and divide by 12
                float interestRate = scanner.nextFloat();
                float monthlyInterestRate = (interestRate / 100) / 12;
                monthlyInterestRate++;

                System.out.print("Period (Years): ");
                int numberOfpyments = scanner.nextInt();
                int pymentDuration = numberOfpyments * 12;

                float calcInterestRate = (float) (monthlyInterestRate
                                * (Math.pow(monthlyInterestRate, pymentDuration)));
                System.out.println("Mortgage: " + calcInterestRate);
        }
}
