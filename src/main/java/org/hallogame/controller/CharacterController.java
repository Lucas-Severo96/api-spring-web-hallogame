package org.hallogame.controller;

import org.hallogame.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.hallogame.model.Character;


@RestController
@RequestMapping(value = "/character")
public class CharacterController {

    @Autowired
    CharacterService service;

    @PostMapping("/save")
    public ResponseEntity<Character> saveCharacter(@RequestBody Character chars){
        chars = service.salvar(chars);
        return ResponseEntity.ok().body(chars);
    }

}
