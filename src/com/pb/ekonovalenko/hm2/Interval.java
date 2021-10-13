package com.pb.ekonovalenko.hm2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int x;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        x = scan.nextInt();

        if (x >= 0 && x <= 14) {
            System.out.print("Ваше число в первом промежутке [0-14]");
        } else {
            if (x >= 15 && x <= 35) {
                System.out.print("Ваше число в втором промежутке [15-35]");
            } else {
                if (x >= 36 && x <= 50) {
                    System.out.print("Ваше число в третьем промежутке [36-50]");
                } else {
                    if (x >= 51 && x <= 100) {
                        System.out.print("Ваше число в четвертом промежутке [51-100]");
                    } else  {
                            System.out.print("Ваше число за пределами имеющихся промежутков");
                        }
                    }
                }

            }
        }
    }
