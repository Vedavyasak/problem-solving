package com.array;

import java.util.Arrays;

public class ArrangBasedOnPivot {

	public static void main(String[] args) {
		int[] a = {16,2,13,11,7,1,10,8,11,2,4};
		reArrange(7,a);

	}
	
	public static void reArrange(int x, int[] a) {
		
		int first = 0;
		int last = a.length-2;
		int temp = 0;
		int temp_current = 0;
		
		for(int i = 0;i<a.length;i++) {
			if(a[i] == x) {
				temp = a[i];
				a[i] = a[a.length-1];
				a[a.length-1] = temp;
			}
			
		}
		while(first<=last) {
			 if(a[first]>= x) {
				temp = a[first];
				a[first] = a[last];
				a[last] = temp;
				last--;
			}else if(a[first] < x) {
				first++;
			}
			temp_current = first;
		}
		temp = a[temp_current];
		a[temp_current] = a[a.length-1];
		a[a.length-1] = temp;
		System.out.println("Arrays way before:"+Arrays.toString(a));
	}
	


}
