package com.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] args) {
	
	//논리연산자
		
		//&&
		System.out.println("&&논리연산자");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		//||
		System.out.println("||논리연산자");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		System.out.println("========");
		int a=5;
		int b=7;
		
		System.out.println(a<b&&a!=b); //t
		System.out.println(a<b&&a==b); //f
		System.out.println(a>b&&a!=b); //f
		System.out.println(a>b&&a==b); //f
		System.out.println(a<b||a!=b); //t
		System.out.println(a<b||a==b); //t
		System.out.println(a>b||a!=b); //t
		System.out.println(a==b||a>b); //f

	}
}
