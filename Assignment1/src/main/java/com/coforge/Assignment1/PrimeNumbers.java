package com.coforge.Assignment1;

import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n <= 1) 
        	return false;
        for (int i = 2; i * i <= n; i++) 
        {
            if (n % i == 0) 
            	return false;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        System.out.print("Prime numbers: ");
        for (int num : arr) {
            if (isPrime(num)) 
            	System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }
}