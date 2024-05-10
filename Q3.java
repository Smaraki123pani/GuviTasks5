
//3. You are a teacher in school. In your class there are 10 students, 
//you have decided to give special gifts to those students whose names start with "A" ,
//you are asked to separate those students with the help of a java program
//Requirement:
//Use List interface to store the student name
//Use a lambda expression and the Stream API to filter the students

package com.demo.task.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("Alice", "Bob", "Aman", "Alex", "Ram", "Akshay", "Avi", "David", "Josef", "John");

        List<String> gift = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students whose names start with 'A':");
        System.out.println(gift);
		
	}

}
