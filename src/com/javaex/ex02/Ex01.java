package com.javaex.ex02;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("점수: ");
	
	int point = sc.nextInt();

	if(point>=60) {
		//true이면	
			
	System.out.print("합격입니다.");
	}
	
	//if(point<60)
	
	else {
		
	System.out.print("불합격입니다.");
	}

	
	sc.close();
		
	}
	
}
