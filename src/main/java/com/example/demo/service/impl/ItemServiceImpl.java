package com.example.demo.service.impl;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ItemServiceImpl implements ItemService {

	@Override
	public List<Item> findAll() {
		return Arrays.asList(new Item(BigInteger.valueOf(1), "pen", 10), new Item(BigInteger.valueOf(2), "pencil", 5));
	}
}
