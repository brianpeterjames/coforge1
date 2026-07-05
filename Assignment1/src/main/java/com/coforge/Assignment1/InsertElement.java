package com.coforge.Assignment1;
import java.util.Scanner;
import java.util.Arrays;

public class InsertElement 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum capacity of array storage: ");
        int cap = sc.nextInt();
        int[] arr = new int[cap];
        
        System.out.print("Enter active size filled right now: ");
        int size = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) 
        	arr[i] = sc.nextInt();
        
        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter index position (0 to " + size + "): ");
        int pos = sc.nextInt();
        
        if (size >= cap) {
            System.out.println("Array is full. Insertion failed.");
        } else {
            for (int i = size; i > pos; i--) 
            	arr[i] = arr[i - 1];
            arr[pos] = element;
            size++;
            int[] result = Arrays.copyOf(arr, size);
            System.out.println("After insertion: " + Arrays.toString(result));
        }
        sc.close();
    }
}