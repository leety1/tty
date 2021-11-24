package com.example.demo.magazine;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

enum Clothes{Price,Weather,Brand};

public class magazineCommon {
	static Clothes cP = Clothes.Price;
	static Clothes cW = Clothes.Weather;
	static Clothes cB = Clothes.Brand;
	
	static List<Clothes> list = Arrays.asList(cP,cW,cB);
	
	public static void main(String[] args) {
		magazineCommon mc = new magazineCommon();
		//Lazy 지연 연산
		/*
		 * boolean b = list.stream().allMatch(str->{ System.out.println(str); return
		 * str.equals(cB); });
		 */
		//Stream 생성
		Stream<Clothes> stream = list.stream();
		//병렬 Stream
		Stream<Clothes> Parallelstream = list.parallelStream();
		
		
		boolean isClothe=stream.allMatch(a->{
			System.out.println(a);
			return a.equals(list);
		});
		
	}
}
