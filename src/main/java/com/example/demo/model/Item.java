package com.example.demo.model;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Item {

	private BigInteger id;
	
	private String title;
	
	private double price;
}
