package cz.czechitas.ukol06.svatky;

import org.junit.jupiter.api.Test;

import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

class SvatkySluzbaTest {
    @Test
    void vyhledatSvatkyKeDni() {
        //TODO implementovat test metody vyhledatSvatkyKeDni
        //String denTest = "--03-18";
        String jmenoTest = "Eduard";
        String vysledek = vyhledatSvatkyKeDni(MonthDay.of(3, 18));
        assertEquals(jmenoTest, vysledek);
    }
}
