
//4. Rajesh has been given a task to create an app which takes the user's birthDate as input and calculates their age, 
//you have to help him to build this app using the java.time.LocalDate class.
//Input:
//Enter your birthDate (yyyy-mm-dd): 1990-05-15
//Output:
//Your age is: 33 years, 4 months, and 13 days.

package com.demo.task.five;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birthDate (yyyy-mm-dd): ");
        String birthdateString = sc.nextLine();

        LocalDate birthdate = LocalDate.parse(birthdateString);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthdate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");
		
	}

}
