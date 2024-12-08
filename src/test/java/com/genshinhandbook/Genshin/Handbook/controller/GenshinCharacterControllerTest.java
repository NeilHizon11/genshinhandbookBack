package com.genshinhandbook.Genshin.Handbook.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.genshinhandbook.Genshin.Handbook.model.GenshinCharacter;
import com.genshinhandbook.Genshin.Handbook.service.GenshinCharacterService;

/**
 * Unit test for GenshinCharacterController class.
 * Author: antoni
 * Date: 12/08/2024
 */

@WebMvcTest(GenshinCharacterController.class)
class GenshinCharacterControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private GenshinCharacterService genshinCharacterService;

	@Autowired
	private ObjectMapper objectMapper;

	/**
	 * Test the getAllGenshinCharacter() method.
	 * Verifies that the controller returns a list of all characters.
	 */
	@Test
	void testGetAllCharacters() throws Exception {
		GenshinCharacter char1 = new GenshinCharacter(1, "Diluc", "Pyro", "DPS", "5-star", "photoUrl");
		GenshinCharacter char2 = new GenshinCharacter(2, "Ayaka", "Cyro", "DPS", "5-star", "photoUrl");
		List<GenshinCharacter> characterList = Arrays.asList(char1, char2);

		when(genshinCharacterService.getAllGenshinCharacter()).thenReturn(characterList);

	}

	/**
	 * Test the addGenshinCharacter() method.
	 * Verifies that the controller can add a new character.
	 */
	@Test
	void testAddCharacter() throws Exception {
		GenshinCharacter newCharacter = new GenshinCharacter(1, "Diona", "Cryo", "Healer", "4-star", "newPhotoUrl");

		when(genshinCharacterService.saveGenshinCharacter(any(GenshinCharacter.class))).thenReturn(newCharacter);

		mockMvc.perform(
				post("/api/add").contentType("application/json").content(objectMapper.writeValueAsString(newCharacter)))
				.andExpect(status().isOk()).andExpect(jsonPath("$").value("Character has been added successfully"));
	}
}
