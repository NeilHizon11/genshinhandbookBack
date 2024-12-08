package com.genshinhandbook.Genshin.Handbook.service;

import com.genshinhandbook.Genshin.Handbook.model.GenshinCharacter;

import java.util.List;

public interface GenshinCharacterService {

    public GenshinCharacter saveGenshinCharacter(GenshinCharacter genshinCharacter);
    public List<GenshinCharacter> getAllGenshinCharacter();
}
