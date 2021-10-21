package com.pb.ekonovalenko.hm3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random r = new Random();
        int x;
        x = r.nextInt(101);
        int y;
        int counter;
        

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите целое число из диапазона от 0 до 100");

        do {
            y = scn.nextInt();
            if (y <= 0 || y >= 100) {
                System.out.println("Вы ввели число не из заданного диапазона ");
                System.out.println("Повторите ввод");
            } else if (y > x) {
                System.out.println("Задуманое число меньше введенного");
                System.out.println("Повторите ввод числа");
            } else if (y < x) {
                System.out.println("Задуманое число больше введенного");
                System.out.println("Повторите ввод числа");
                counter = 1;
            } else if (y == x) {
                System.out.println("ПОЗДРАВЛЯЮ! Вы угадали число");
                System.out.println("Игра окончена");
            }

        }
        while (x != y);

    }
}





