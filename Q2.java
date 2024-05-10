
//2. Write a program to check whether the Strings in the List are empty or not and print the list having non-empty strings. 
//If the given List is: ListStrings = Arrays asList("abc", "", "bc", "efg", "abcd","", "jkl");

package com.demo.task.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2 {
	public static void main(String[] args) {
		 List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	        List<String> nonEmptyStrings = new ArrayList<>();
	        System.out.println("If the Strings in the List are empty=" + listStrings.isEmpty());
	        System.out.println("==================================================================");

	        for (String str : listStrings) {
	            if (!str.isEmpty()) {
	                nonEmptyStrings.add(str);
	               
	            }
	        }

	        System.out.println("List of non-empty strings:");
	        System.out.println(nonEmptyStrings);
	    }
	
	}


