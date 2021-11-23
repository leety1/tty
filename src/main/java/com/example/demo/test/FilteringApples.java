package com.example.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//녹색 사과 필터링
public class FilteringApples {
	public static void main(String[] args) {
		List<Apple> apple = Arrays.asList(new Apple(100,"green"),new Apple(160,"red"));
		List<Apple> redApples = filterGreenApples(apple,"red",10,true);
		List<Apple> genericRedApples = filter(apple,(Apple a)-> "red".equals(a.getColor()));
		System.out.println(redApples);
		System.out.println(genericRedApples);
		List<Integer> numbers = Arrays.asList(1,2,3);
		List<Integer> even = filter(numbers,(Integer i)->i%2==0);
		System.out.println(even);
		List<Apple> greenApples = filterGreenApples(apple,"green",150,true);
		System.out.println(greenApples.toString());
		
		//람다 표현식
		List<Apple> lamda = filterApplesPredicate(apple,(Apple a)->"red".equals(a.getColor()));
		System.out.println("lamad:"+lamda);
		List<Apple> lamda2 = filterApplesPredicate(apple,(Apple a)->"red".equals(a.getColor()));
		System.out.println("lamad2:"+lamda2);
		//boolean flag 연습
		int a = 15;
		boolean flag = false;
			while(a<20) {
				System.out.println(a);
				int b=5;
				while(b<=10) {
					System.out.println(a+" "+b);
					if(b==7) {
						flag = true;break;
					}b++;
				}
				if(flag)break;
				a++;
			}
			System.out.println("END");
		
			Runnable run =()->System.out.println("Hello");
			
			
		
	}
	static List<Apple>filterGreenApples(List<Apple> inventory,String color,int weight,boolean flag){
		ArrayList<Apple> rst = new ArrayList<>();
		
		for(Apple apple:inventory) {
			if((flag && apple.getColor().equals(color))||
					(!flag&&apple.getWeight()>weight)) {
				rst.add(apple);
		}
		}
		
		return rst;
		
	}
	static <T> List<T> filter(List<T> list , Predicate<T> p){
		ArrayList<T> rst = new ArrayList<>();
		for(T e : list) {
			if(p.test(e)) {
				rst.add(e);
			}
		}
		return rst;
		
	}
	static List<Apple> filterApplesPredicate(List<Apple> inventory,ApplePredicate p){
		ArrayList<Apple> rst = new ArrayList<>();
		for(Apple apple : inventory) {
			if(p.test(apple)) {
				rst.add(apple);
			}
		}
		return rst;
	}

}
