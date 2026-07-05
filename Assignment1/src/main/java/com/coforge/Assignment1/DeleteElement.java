package com.coforge.Assignment1;

import java.util.Scanner;
import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        
        System.out.print("Enter index position to delete (0 to " + (size-1) + "): ");
        int delIdx = sc.nextInt();
        
        if (delIdx < 0 || delIdx >= size) 
        {
            System.out.println("Invalid index.");
        } 
        else 
        {
            for (int i = delIdx; i < size - 1; i++) 
            	arr[i] = arr[i + 1];
            size--;
            int[] result = Arrays.copyOf(arr, size);
            System.out.println("After deletion: " + Arrays.toString(result));
        }
        sc.close();
    }
}