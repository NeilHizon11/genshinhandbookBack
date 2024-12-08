package com.genshinhandbook.Genshin.Handbook.controller;


import com.genshinhandbook.Genshin.Handbook.model.GenshinCharacter;
import com.genshinhandbook.Genshin.Handbook.service.GenshinCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/")
@CrossOrigin(originPatterns = "http://localhost:3000")
public class GenshinCharacterController {

    @Autowired
    private GenshinCharacterService genshinCharacterService;

    @PostMapping("/add")
    public String add(@RequestBody GenshinCharacter genshinCharacter) {
        genshinCharacterService.saveGenshinCharacter(genshinCharacter);
        return "Character has been added successfully";
    }

    @GetMapping("/getAll")
    public List<GenshinCharacter> getAllGenshinCharacter() {
        return genshinCharacterService.getAllGenshinCharacter();
    }

    ;


}
