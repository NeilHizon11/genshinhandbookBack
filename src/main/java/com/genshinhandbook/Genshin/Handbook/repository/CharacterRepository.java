package com.genshinhandbook.Genshin.Handbook.repository;

import com.genshinhandbook.Genshin.Handbook.model.GenshinCharacter;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CharacterRepository extends JpaRepository<GenshinCharacter, Integer> {
    // all crud database method is here
}
