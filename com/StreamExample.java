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
		
		
	
	}

}
