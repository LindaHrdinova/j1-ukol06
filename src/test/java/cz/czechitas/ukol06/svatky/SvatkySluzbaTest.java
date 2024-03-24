package cz.czechitas.ukol06.svatky;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.Month;
import java.time.MonthDay;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SvatkySluzbaTest {
    @Test
    void vyhledatSvatkyKeDni() throws IOException {
        //TODO implementovat test metody vyhledatSvatkyKeDni
        String denTest = "--03-18";
        List<String> jmenoTest = List.of("Eduard");
        SvatkySluzba svatky = new SvatkySluzba();
        assertEquals(jmenoTest, svatky.vyhledatSvatkyKeDni(MonthDay.of(3,18)));
    }
}
