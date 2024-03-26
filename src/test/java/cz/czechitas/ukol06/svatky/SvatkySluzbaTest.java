package cz.czechitas.ukol06.svatky;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.Month;
import java.time.MonthDay;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SvatkySluzbaTest {

    SvatkySluzba svatky = new SvatkySluzba();

    SvatkySluzbaTest() throws IOException {
    }

    @Test
    void vyhledatSvatkyKeDni() {
        List<String> jmenoTest = List.of("Eduard");
        assertEquals(jmenoTest, svatky.vyhledatSvatkyKeDni(MonthDay.of(3, 18)));
    }

    @Test
    void vyhledatVicSvatkuKeDni() {
        List<String> jmenaTest = List.of("Linda", "Samuel", "Jiljí");
        assertEquals(jmenaTest, svatky.vyhledatSvatkyKeDni(MonthDay.of(9, 1)));
    }

    @Test
    void vyhledatNesvatekKeDni() {
        assertTrue(svatky.vyhledatSvatkyKeDni(MonthDay.of(1, 1)).isEmpty());
    }
}
