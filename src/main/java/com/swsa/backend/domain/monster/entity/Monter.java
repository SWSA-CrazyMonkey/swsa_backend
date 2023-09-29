package com.swsa.backend.domain.monster.entity;

import jakarta.persistence.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Entity
public class Monter {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "f_monster_id")
    private Long id;

}
