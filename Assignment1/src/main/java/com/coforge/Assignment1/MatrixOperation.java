package com.coforge.Assignment1;

import java.util.Scanner;

public class MatrixOperation {
    public static void inputMatrix(Scanner sc, int[][] matrix, int r, int c) 
    {
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = sc.nextInt();
    }

    public static void displayMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) 
        {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols for Matrix 1: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.print("Enter rows and cols for Matrix 2: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        
        System.out.println("Enter Matrix 1 elements:");
        inputMatrix(sc, a, r1, c1);
        System.out.println("Enter Matrix 2 elements:");
        inputMatrix(sc, b, r2, c2);
        
        while (true) {
            System.out.print("\n--- MENU ---\n1. Add\n2. Subtract\n3. Multiply\n4. Exit\nEnter choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    if (r1 != r2 || c1 != c2) { System.out.println("Dimensions mismatch!"); break; }
                    int[][] sum = new int[r1][c1];
                    for (int i = 0; i < r1; i++) 
                    	for (int j = 0; j < c1; j++) 
                    		sum[i][j] = a[i][j] + b[i][j];
                    displayMatrix(sum);
                    break;
                case 2:
                    if (r1 != r2 || c1 != c2) 
                    { 
                    	System.out.println("Dimensions mismatch!"); 
                    	break; 
                    }
                    int[][] diff = new int[r1][c1];
                    for (int i = 0; i < r1; i++) 
                    	for (int j = 0; j < c1; j++) 
                    		diff[i][j] = a[i][j] - b[i][j];
                    displayMatrix(diff);
                    break;
                case 3:
                    if (c1 != r2) 
                    { 
                    	System.out.println("Multiplication impossible!"); 
                    	break; 
                    }
                    int[][] prod = new int[r1][c2];
                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c2; j++) {
                            for (int k = 0; k < c1; k++) prod[i][j] += a[i][k] * b[k][j];
                        }
                    }
                    displayMatrix(prod);
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}