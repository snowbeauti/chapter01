package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		
		int hour = sc.nextInt();
		int pay; //급여
		int hourlypay = 10000;
		int addhourlypay = (int)(10000 * 1.5);
		
		if(hour>8) 
		{pay = (hour * hourlypay) + (hour - 8) * addhourlypay;}

		else
		{pay = hour * hourlypay;}
		
		System.out.print("임금은 " + pay + "원 입니다.");
		
		sc.close();
	}


}
