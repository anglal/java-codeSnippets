package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(2);
		intList.add(4);
		intList.add(7);
		intList.add(9);
		intList.add(5);
		intList.add(1);
		intList.add(0);
		intList.add(6);
		
		
//		Unmodifiable list
		List<Integer> intList1 = List.of(2,4,7,9,5,1,0,6);
		
		
// 		List from array
		List<Integer> intList2 = Arrays.asList(2,4,7,9,5,1,0,6);
		
//		Find list of integers divisible by 3 using stream api
		Stream<Integer> stream = intList.stream();
		List<Integer> newList = stream.filter((x)->x%3 ==0).collect(Collectors.toList());
		System.out.println(newList);

//		Find list of integers divisible by 5 using stream api
		
		List<Integer> newList1 = intList1.stream().filter(x->x%5==0).collect(Collectors.toList());
		System.out.println(newList1);

//		Multiply all numbers by -3
		List<Integer> newList2 = intList2.stream().map(x-> x * -2).collect(Collectors.toList());
		System.out.println(newList2);
		
//		Create the array of items
		String[] strArray = new String[] { "Pen" ,"Pencil", "Book"};
		
		Stream<String> strStream = Stream.of(strArray);

//		Print everything from stream of items
		System.out.println();
		strStream.forEach((s)-> {System.out.println(s);});
		
//		Create a stream of list of items
		List<String> countries = List.of("Nepal", "Netherlands", "China", "India", "USA");
//		Find the countries that start with letter "N";
		
		List<String> contWithN = countries.stream().filter(x -> x.startsWith("N")).collect(Collectors.toList());
		System.out.println(contWithN);
		System.out.println();
		
//		Find the squareroot of given list of numbers
		List<Integer> intList01 = Arrays.asList(4, 9, 16, 25);
		
		intList01.stream().map(x-> Math.sqrt(x)).forEach(x->System.out.println(x));
		System.out.println();
		
		
//		Sort the given list of numbers
		
		List<String> names = List.of("Jhon", "Maria","Jeena","Mark");
		List<Integer> ages = Arrays.asList(23,12,43,25,87,56,3,4);
		
		names.stream().sorted().forEach(x -> System.out.println(x));
		System.out.println();
		ages.stream().sorted().forEach( age -> System.out.println(age));
		System.out.println();
		
		
//		Find the minimum and maximum age
		int ageMax = ages.stream().max((age1, age2)-> age1.compareTo(age2)).get();
		System.out.println(ageMax);
		
		System.out.println();
		ages.stream().forEach(System.out::println);
		

	
	}

	
	
}
