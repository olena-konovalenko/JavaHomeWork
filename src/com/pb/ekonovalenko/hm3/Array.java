package com.pb.ekonovalenko.hm3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 10 любых целых чисел");
        for (int y = 0; y <= 9; y++) {
            nums[y] = scan.nextInt();
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println(nums[i]);
            sum = nums[i] + sum;
        }
        System.out.println("Сумма массива равна "+ sum);
    }
}
