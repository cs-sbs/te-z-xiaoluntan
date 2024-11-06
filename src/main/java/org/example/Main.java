package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCount = 0;
        int evenCount = 0;

        while (true) {
            String input = scanner.next();
            if (input.equals("-1")) {
                break;
            }
            int num = Integer.parseInt(input);
            if (num >= 0 && num < 100000) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println(oddCount + " " + evenCount);
    }
}

