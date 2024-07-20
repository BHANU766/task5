package com.task5;

import java.util.Scanner;

public class Que4 {	

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);	       
		       
		        System.out.print("Enter a number (size of X): ");
		        
		        int size = scanner.nextInt();
		        
		        
		        printX(size);
		    }

		    public static void printX(int size) {
		      
		        for (int i = 0; i < size; i++) {
		          
		            for (int j = 0; j < size; j++) {
		               
		                if (i == j || i + j == size - 1) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            
		            System.out.println();
		        }
		    }
		

	}


