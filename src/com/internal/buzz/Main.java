package com.internal.buzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int BUZZ = 5;
        final int FIZZ = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value:");
        int number = scanner.nextByte();

        if (number % BUZZ == 0 && number % FIZZ == 0)
            System.out.println("FizzBuzz");
        else if (number % BUZZ == 0)
            System.out.println("Buzz");
        else if (number % FIZZ == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);

        scanner.close();
    }
}
