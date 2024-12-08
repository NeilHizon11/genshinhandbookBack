package com.genshinhandbook.Genshin.Handbook;

import com.genshinhandbook.Genshin.Handbook.model.GenshinCharacter;
import com.genshinhandbook.Genshin.Handbook.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenshinHandbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenshinHandbookApplication.class, args);
	}


}
