package com.coforge.Assignment1;

import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        System.out.print("Enter target element to count frequency: ");
        int target = sc.nextInt();
        
        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }
        System.out.println("Number " + target + " repeated " + count + " times.");
        sc.close();
    }
}