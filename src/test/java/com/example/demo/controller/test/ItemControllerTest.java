package com.example.demo.controller.test;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.example.demo.controller.ItemController;
import com.example.demo.model.Item;
import com.example.demo.service.ItemService;

@WebMvcTest(ItemController.class) // load only mvc part not full app.
public class ItemControllerTest {

	@Autowired
	private MockMvc mockMvc; // can simulate http request without start server

	@MockBean
	private ItemService itemService;

	@Test
	void testFindAllItems() {

		// arrange
		List<Item> items = Arrays.asList(new Item(BigInteger.valueOf(1), "pen", 10),
				new Item(BigInteger.valueOf(2), "pencil", 5));
		when(itemService.findAllItems()).thenReturn(items);//stub

		try {
			// act
			ResultActions resultActions = mockMvc.perform(get("/items").contentType(MediaType.APPLICATION_JSON));
			// assert
			resultActions.andExpect(status().isOk())
			.andExpect(jsonPath("$.size()").value(2))
					.andExpect(jsonPath("$[0].title").value("pen"))
					.andExpect(jsonPath("$[1].price").value(5));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
