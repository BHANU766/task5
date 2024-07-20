package com.task5;

import java.util.Scanner;

public class Que6 {
				
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter number of month: ");
		        
		        int month = scanner.nextInt();
		        

		        System.out.print("Enter room rent per day: ");
		        double roomRent = scanner.nextDouble();

		        System.out.print("Enter number of days stayed: ");
		        int daysStayed = scanner.nextInt();
		        
		       
		        double totalTariff = roomRent * daysStayed;	
		        
		        System.out.printf("Hotel tariff to be paid: %.2f%n", totalTariff);
		    }	

	}


