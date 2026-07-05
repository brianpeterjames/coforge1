package com.coforge.Assignment1;

import java.util.Scanner;
import java.util.Arrays;

public class ResizeableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter initial array capacity: ");
        int capacity = sc.nextInt();
        int[] arr = new int[capacity];
        
        System.out.println("Enter " + capacity + " elements to fill capacity:");
        for (int i = 0; i < capacity; i++) arr[i] = sc.nextInt();
        System.out.println("Array tracking capacity: " + Arrays.toString(arr));
        
        System.out.print("Enter number of extra values you want to append: ");
        int extra = sc.nextInt();
        

        int[] newArr = new int[capacity + extra];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr; 
        
        System.out.println("Enter " + extra + " more elements:");
        for (int i = capacity; i < capacity + extra; i++) 
        	arr[i] = sc.nextInt();
        
        System.out.println("Resized array elements final state: " + Arrays.toString(arr));
        sc.close();
    }
}