package org.hallogame;

import org.hallogame.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.hallogame.model.Character;
import org.hallogame.repository.CharacterRepository;

@Component
public class Initialize implements CommandLineRunner{

    @Autowired
    CharacterService service;

    @Autowired
    Character newCharacter;

    @Override
    public void run(String... args) throws Exception {
        Character newCharacter = new Character();
        newCharacter.setName("Jakarta");
        newCharacter.setSkill("Fogo");
        newCharacter.setWeakness("Água");
        newCharacter.setStrength(30);
        newCharacter.setIntelligence(70);
        newCharacter.setDamage(60);
        newCharacter.setType("Magia");
        service.salvar(newCharacter);
        
    }

}
