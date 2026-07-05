package com.coforge.Assignment1;

import java.util.Scanner;

public class SecondMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secMax = max;
                max = num;
            } else if (num > secMax && num != max) {
                secMax = num;
            }
        }
        System.out.println("Second Maximum: " + secMax);
        sc.close();
    }
}
