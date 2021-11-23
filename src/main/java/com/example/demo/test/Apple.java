package com.example.demo.test;

import org.apache.commons.lang3.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @AllArgsConstructor
public class Apple {
	private int weight = 0;
	private String color = StringUtils.EMPTY;

}
