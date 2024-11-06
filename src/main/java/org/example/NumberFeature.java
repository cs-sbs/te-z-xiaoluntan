package org.example;
import java.util.Scanner;
public class NumberFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个非负整数（0-1000000）：");
        int number = scanner.nextInt();
        int result = calculateOddEvenFeatureValue(number);
        System.out.println("计算结果为：" + result);
        scanner.close();
    }

    private static int calculateOddEvenFeatureValue(int number) {
        int result = 0;
        int position = 1;
        while (number > 0) {
            int digit = number % 10;
            boolean isDigitEven = digit % 2 == 0;
            boolean isPositionEven = position % 2 == 0;
            if (isDigitEven == isPositionEven) {
                result += (int) Math.pow(2, position - 1);
            }
            number /= 10;
            position++;
        }
        return result;
    }
}

