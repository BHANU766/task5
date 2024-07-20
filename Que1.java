package com.task5;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			   
		        Scanner scanner = new Scanner(System.in);
		        	       
		        System.out.print("Enter a string: ");
		        
		        String input = scanner.nextLine();
		        
		       		        
		        boolean isPalindrome = checkPalindrome(input);
		       
		        if (isPalindrome) {
		            System.out.println("The string \"" + input + "\" is a palindrome.");
		        } else {
		            System.out.println("The string \"" + input + "\" is not a palindrome.");
		        }
		    }

		    public static boolean checkPalindrome(String input) {
		        int length = input.length();
		      
		        for (int i = 0; i < length / 2; i++) {
		            if (input.charAt(i) != input.charAt(length - 1 - i)) {
		                return false; // Characters not match, not a palindrome
		            }
		        }
		        return true; //  characters match, palindrome
		    }
		

	}


