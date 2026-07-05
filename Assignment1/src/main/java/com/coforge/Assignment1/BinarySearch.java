package com.coforge.Assignment1;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) 
        	arr[i] = sc.nextInt();
        
        System.out.print("Enter target element to search: ");
        int target = sc.nextInt();
        
        int low = 0, high = n - 1, index = -1;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) 
            {
                index = mid;
                break;
            }
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        
        if (index != -1) 
        	System.out.println("Element found at index: " + index);
        else 
        	System.out.println("Element not found.");
        sc.close();
    }
}
