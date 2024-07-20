package com.task5;

import java.util.Scanner;

public class Que3 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);	       
		        
		        System.out.print("Enter a number: ");
		        
		        int input = scanner.nextInt();
		        
		        
		        int count = 1;  
		        
		        for (int i = 1; i <= input; i++) {
		           
		            for (int j = 1; j <= i; j++) {
		                System.out.print(count++ + " ");
		            }
		            System.out.println(); 
		        }
		    }
		
	}


