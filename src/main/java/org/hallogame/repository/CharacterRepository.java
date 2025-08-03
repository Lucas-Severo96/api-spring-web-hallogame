package org.hallogame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.hallogame.model.Character;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

}
