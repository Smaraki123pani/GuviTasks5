
//1. Write a program using map() method, to convert a list of Strings into upperCase.
//If the given List is:  Stream names = Stream of("aBc", "d", "ef");



package com.demo.task.five;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q1 {
	public static void main(String[] args) {
		 Stream<String> names = Stream.of("aBc", "d", "ef");

	        List<String> uppercaseNames = names.map(String::toUpperCase)
	                                           .collect(Collectors.toList());

	        System.out.println("Uppercase names:");
	        System.out.println(uppercaseNames);
	}

}
