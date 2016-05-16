/************************************************
 * Current function
 ***********************************************/
package com.alian.demo;

public class CurrentFunction {
	
	public String getLevel(int score) {
		String strLevel = "";
		if ( 100>=score && score>=90 ){
			strLevel = "优秀";
		}
		else if ( 89>=score && score>=80 ){
			strLevel = "良好";
		}
		else if ( 79>=score && score>=70 ){
			strLevel = "中等";
		}
		else if ( 69>=score && score>=60 ){
			strLevel = "及格";
		}
		else{
			strLevel = "不及格";
		}
		return strLevel;
	}
	
	public int getMax(int[] arrayNum) {
		int nMax = arrayNum[0];
		for (int i = 1; i < arrayNum.length; i++) {
			if (nMax<arrayNum[i]) {
				nMax = arrayNum[i];
			}
		}
		return nMax;
	}
	
	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i<array.length-1) {
				System.out.print(array[i]+".");
			} else {
				System.out.println(array[i]);
			}
		}
	}
	
	public void swap(int[] array, int nFirst, int nSecond) {
		int temp = 0;
		temp = array[nFirst];
		array[nFirst] = array[nSecond];
		array[nSecond] = temp;
	}
	
	public void selectSort(int[] array,int bigToSmall) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (1==bigToSmall) {
					if( array[i]<array[j] ){
						this.swap(array, i, j);
					}
				} 
				else {
					if( array[i]>array[j] ){
						this.swap(array, i, j);
				    }
			    }
		    }
	    }
	}
}
