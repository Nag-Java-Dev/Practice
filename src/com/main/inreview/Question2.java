package com.main.inreview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(display(new String[] { "BNageswararao", "Bhargava", "ajifhkas" })));
	}

	public static String[] display(String[] arr) {
		List<String> al = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() >= 8 && arr[i].toLowerCase().startsWith("b")) {
				al.add(arr[i]);

			}
		}
		String[] res = new String[al.size()];

		for (int i = 0; i < al.size(); i++) {
			res[i] = al.get(i);
		}

	//return 	Arrays.asList(arr).stream().filter(i->i.length()>=8 && i.startsWith("B")).toArray(String[]::new);
	return res;
	}

}
