package com.coforge.Assignment1;

import java.util.Scanner;
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first sorted array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter sorted elements for first array:");
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();
        
        System.out.print("Enter size of second sorted array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter sorted elements for second array:");
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();
        
        int[] res = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (a[i] < b[j]) 
            	res[k++] = a[i++];
            else 
            	res[k++] = b[j++];
        }
        while (i < n1) 
        	res[k++] = a[i++];
        while (j < n2) 
        	res[k++] = b[j++];
        
        System.out.println("Merged sorted array: " + Arrays.toString(res));
        sc.close();
    }
}