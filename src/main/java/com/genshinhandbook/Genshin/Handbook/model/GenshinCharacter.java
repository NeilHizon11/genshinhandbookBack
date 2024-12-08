package com.genshinhandbook.Genshin.Handbook.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data


@Entity
public class GenshinCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String element;
    private String role;
    private String rarity;
    private String photoUrl;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        return element;
    }

    public String getRole() {
        return role;
    }

    public String getRarity() {
        return rarity;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }
}
