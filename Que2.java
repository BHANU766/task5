package com.task5;

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		        Scanner sc = new Scanner(System.in);	       
		        
		        System.out.print("Enter a string: ");
		        
		        String original = sc.nextLine();
		        
		       
		        String reversed = reverseString(original);
		       
		        System.out.println("Reversed string: " + reversed);
		    }

		    public static String reverseString(String original) {
		        int length = original.length();
		        StringBuilder reversed = new StringBuilder(length);
		       
		        for (int i = length - 1; i >= 0; i--) {
		            reversed.append(original.charAt(i));
		        }

		        return reversed.toString();
		    }
		

	}


