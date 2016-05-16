/****************************************************
loop through array
int[] array = {1,3,2,4,3,5,4,6,5,7,6,8,7,9,8,0};
****************************************************/
package com.alian.demo;

public class PrintArrayDemo {

	public static void main(String[] args) {
		int[] array = {1,3,2,4,3,5,4,6,5,7,6,8,7,9,8,0};
		CurrentFunction crtFunc = new CurrentFunction();
		crtFunc.printArray(array);
	}
}
