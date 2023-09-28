package com.swsa.backend.calculator;

import com.swsa.backend.domain.member.agile.AgileService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {

    @Autowired
    AgileService agileService;
    @Test
    void agileTest () {

        Double 빛주 = agileService.calculateAgile(102, 200);
        Double 물선인 = agileService.calculateAgile(118, 180);
        Double 물웅묘 = agileService.calculateAgile(96, 210);
        Double 암실피드 = agileService.calculateAgile(103, 200);
        Double 풍드 = agileService.calculateAgile(113, 183);

        System.out.println("빛주 = " + 빛주);
        System.out.println("물선인 = " + 물선인);
        System.out.println("물웅묘 = " + 물웅묘);
        System.out.println("암실피드 = " + 암실피드);
        System.out.println("풍드 = " + 풍드);

    }
}
