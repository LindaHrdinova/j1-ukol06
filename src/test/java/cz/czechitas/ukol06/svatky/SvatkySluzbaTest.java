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
        assertEquals(jmenoTest, svatky.vyhledatSvatkyKeDni(MonthDay.of(3, 18)));
    }

    @Test
    void vyhledatVicSvatkuKeDni() throws IOException {
        //String denTest = "--09-01";
        List<String> jmenaTest = List.of("Linda", "Samuel", "Jiljí");
        SvatkySluzba svatky = new SvatkySluzba();
        assertEquals(jmenaTest, svatky.vyhledatSvatkyKeDni(MonthDay.of(9, 1)));
    }

    @Test
    void vyhledatNesvatekKeDni() throws IOException {
        //String denTest = "--01-01";
        List<String> nejmenaTest = List.of("");
        SvatkySluzba svatky = new SvatkySluzba();
        assertEquals(nejmenaTest, svatky.vyhledatSvatkyKeDni(MonthDay.of(1, 1)));
    }

    @Test
    void vyhledatNesvatekKeDni2() throws IOException {
        //String denTest = "--01-01";
        SvatkySluzba svatky = new SvatkySluzba();
        assertEquals(true, svatky.vyhledatSvatkyKeDni(MonthDay.of(1, 1)).isEmpty());
    }
}
