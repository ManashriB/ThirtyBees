package com.java.myapp.Array;

import java.util.Arrays;

//Example for array sorting
public class ArraySorting {
public static void main(String[] args) {
	
	int arr[] = {10,467,67,8500,600,5668,490,50};
	
	//Arrays.sort(arr);
	Arrays.parallelSort(arr);
	for(int t:arr){ //for each loop(inhance loop)
		
	
	System.out.println(t);
	
      }
    }
}