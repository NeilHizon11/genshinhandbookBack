package com.genshinhandbook.Genshin.Handbook.service;


import com.genshinhandbook.Genshin.Handbook.model.GenshinCharacter;
import com.genshinhandbook.Genshin.Handbook.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class GenshinCharacterServiceImpl implements GenshinCharacterService{

    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public GenshinCharacter saveGenshinCharacter(GenshinCharacter genshinCharacter) {
        return characterRepository.save(genshinCharacter);
    }

    @Override
    public List<GenshinCharacter> getAllGenshinCharacter() {
        return characterRepository.findAll();
    }



}
