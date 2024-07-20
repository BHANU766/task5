package com.task5;

import java.util.Scanner;

public class Que5 {
			
	        public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		       
		        System.out.print("Enter marks: ");
		        
		        int marks = scanner.nextInt();
		       
		      
		        if (marks < 0 || marks > 100) {
		            System.out.println("Invalid input");
		        } else {
		          
		            char grade = calculateGrade(marks);
		            System.out.println("Grade: " + grade);
		        }
		    }

		    public static char calculateGrade(int marks) {
		        char grade;
		        
		        if (marks >= 90 && marks <= 100) {
		            grade = 'A';
		        } else if (marks >= 80 && marks <= 89) {
		            grade = 'B';
		        } else if (marks >= 70 && marks <= 79) {
		            grade = 'C';
		        } else if (marks >= 60 && marks <= 69) {
		            grade = 'D';
		        } else if (marks >= 50 && marks <= 59) {
		            grade = 'E';
		        } else { // marks < 50
		            grade = 'F';
		        }
		        return grade;
		    }
		

	}


