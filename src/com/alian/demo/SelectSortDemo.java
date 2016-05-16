package com.alian.demo;

public class SelectSortDemo {

	public static void main(String[] args) {
		int[] array = {1,34,2,3,56,778,23,44,7,0,11,3,5,77,8,6,4,5,9};
		CurrentFunction crtFunc = new CurrentFunction();
		crtFunc.printArray(array);
		crtFunc.selectSort(array,1);
		crtFunc.printArray(array);
		crtFunc.selectSort(array,0);
		crtFunc.printArray(array);
	}

}
