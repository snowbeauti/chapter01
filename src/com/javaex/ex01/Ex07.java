package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		System.out.println("산술연산자");
		System.out.println("a+b");
		System.out.println(a+b);
		System.out.println("a-b");
		System.out.println(a-b);
		System.out.println("b-a");
		System.out.println(b-a);
		System.out.println("a/b");
		System.out.println(a/b);
		System.out.println("a*b");
		System.out.println(a*b);
		System.out.println("a%b");
		System.out.println(a%b);
		
		
		//부호연산자
		int ver01 = -3;
		System.out.println(ver01);
		System.out.println(-ver01);
		System.out.println(+ver01);
		
		//증감연산자
		System.out.println(a);  //7
		System.out.println(++a);  //8
		System.out.println(a); //8
		System.out.println(--a);  //7
		System.out.println(--a);  //6
		System.out.println(a); //6
		System.out.println(++a);  //7
		System.out.println(a++); //7
		System.out.println(a--); //8
		System.out.println(a); //7
		
		System.out.println(b--);  //2
		System.out.println(b);  //1
		System.out.println(--b);  //0
		
		System.out.println(a>b);  
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a<=b);
	}

}
