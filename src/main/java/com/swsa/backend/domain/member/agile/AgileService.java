package com.swsa.backend.domain.member.agile;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AgileService {

    public static final Double LEADER_AGILE_EFFECT = 0.24;

    public static final Double BUILDING_AGILE_EFFECT = 0.15;


    public Double calculateAgile (Integer orgSpeed, Integer runeSpeed) {

        return orgSpeed * (LEADER_AGILE_EFFECT + BUILDING_AGILE_EFFECT + 1) + runeSpeed;
    }
}
