/******************************************************
 *   Swap age from array
 *   {1,2,3,4,5,6,7,8,9,0}  ->  {1,2,3,9,5,6,7,8,4,0}
******************************************************/
package com.alian.demo;

public class SwapDemo {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		CurrentFunction crtFunc = new CurrentFunction();
		crtFunc.printArray(array);
		crtFunc.swap(array, 3, 8);
		crtFunc.printArray(array);
	}
}
