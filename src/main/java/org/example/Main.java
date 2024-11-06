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
                    try {
                        int num = Integer.parseInt(input);
                        if (num >= 0 && num < 100000) {
                            if (num % 2 == 0) {
                                evenCount++;
                            } else {
                                oddCount++;
                            }
                        } else {
                            System.out.println("请输入一个在范围（0,100000）内的正整数或-1来结束输入。");

                        }
                    } catch (NumberFormatException e) {
                        System.out.println("请输入一个正整数或-1来结束输入。");
                    }
                }

                System.out.println(oddCount + " " + evenCount);
                scanner.close();
            }
        }
