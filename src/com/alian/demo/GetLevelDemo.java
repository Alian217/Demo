/********************************************
定义一个功能，完成对考试成绩的等级划分。
90~100 A 优秀
80~89 B 良好
70~79 C 中等
60~69 D 及格
60以下 E 不及格
*********************************************/
package com.alian.demo;

public class GetLevelDemo {

	public static void main(String[] args) {
		CurrentFunction crtFunc = new CurrentFunction();
		System.out.println(crtFunc.getLevel(78));
	}
}
