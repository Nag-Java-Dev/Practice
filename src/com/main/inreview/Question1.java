package com.main.inreview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question1 {

	public static void main(String[] args) {

		int arr[] = { 13, 7, 6, 12 };

		Arrays.stream(arr).boxed().mapToInt(Integer::intValue).sum();
		Arrays.stream(arr).boxed().collect(Collectors.summingInt(Integer::intValue));
		IntStream.of(arr).sum();

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int arrr[] = list.stream().mapToInt(Integer::intValue).toArray();
		
		String [] strArr = {"","","",""};
		List<String> al = Arrays.asList(strArr);
		strArr = al.stream().toArray(String[]::new);
//
//		List<Integer> list1 = new CopyOnWriteArrayList<>(list);
//
//		int size = list1.size();
//		int var = 0;
//		while (list1.size() != 1) {
//
//			int max = Collections.max(list);
//
//			if (list.get(var) < max) {
//				System.out.println(max);
//			} else {
//				System.out.println(-1);
//			}
//
//			list.remove(var);
//			size--;
//
//			if (size == 1) {
//				System.out.println(-1);
//				break;
//			}
//
//
//		}

	}

}
