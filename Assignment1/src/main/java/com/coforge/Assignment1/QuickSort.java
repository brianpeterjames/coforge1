package com.coforge.Assignment1;

import java.util.Scanner;
import java.util.Arrays;

public class QuickSort {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
    }

    private static int partition(int[] arr, int low, int high) 
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) 
        {
            if (arr[j] < pivot) 
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void sort(int[] arr, int low, int high) 
    {
        if (low < high) 
        {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) 
        	arr[i] = sc.nextInt();
        
        sort(arr, 0, n - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        sc.close();
    }
}