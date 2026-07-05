package com.coforge.Assignment1;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    for (int k = j; k < n - 1; k++) 
                    	arr[k] = arr[k + 1];
                    n--;
                    j--; 
                }
            }
        }
        int[] cleanArr = Arrays.copyOf(arr, n);
        System.out.println("Without duplicates: " + Arrays.toString(cleanArr));
        sc.close();
    }
}