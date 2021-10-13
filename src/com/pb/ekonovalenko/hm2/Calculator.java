package com.pb.ekonovalenko.hm2;


import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {
        int operand1;
        String sing="+";
        int operand2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения operand1");
        operand1 = scan.nextInt();

        System.out.println("Введите знак операции для калькулятора");
        sing = scan.next();

        System.out.println("Введите значения operand2");
        operand2 = scan.nextInt();

        switch (sing) {
            case "+":
                System.out.print("Сумма выших чисел = ");
                System.out.println(operand1+operand2);
                break;
            case "-":
                System.out.print("Разница выших чисел = ");
                System.out.println(operand1-operand2);
                break;
            case "*":
                System.out.print("Произведение выших чисел = ");
                System.out.println(operand1*operand2);
                break;
            case "/":
                System.out.print("Отношение выших чисел = ");
                System.out.println(operand1/operand2);
                break;
        }
    }
}
