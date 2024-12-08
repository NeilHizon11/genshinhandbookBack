package com.genshinhandbook.Genshin.Handbook.service;


import com.genshinhandbook.Genshin.Handbook.model.GenshinCharacter;
import com.genshinhandbook.Genshin.Handbook.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import jakarta.persistence.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

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
