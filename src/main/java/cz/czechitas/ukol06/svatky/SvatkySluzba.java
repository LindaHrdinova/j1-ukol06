package cz.czechitas.ukol06.svatky;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.MonthDay;
import java.util.List;
import java.util.stream.Stream;

public class SvatkySluzba {

    private final ObjectMapper objectMapper = JsonMapper.builder()
            .addModule(new JavaTimeModule())
            .build();
    private final Path cestaKDatum = Path.of("data/svatky.json");
    private final SeznamSvatku seznamSvatku;

    public SvatkySluzba() throws IOException {
        // TODO načíst seznam svátků ze souboru svatky.json
        seznamSvatku = objectMapper.readValue(new File(String.valueOf(cestaKDatum)), SeznamSvatku.class);
    }

    public List<String> vyhledatSvatkyDnes() {
        return vyhledatSvatkyKeDni(MonthDay.now());
    }

    public List<String> vyhledatSvatkyKeDni(MonthDay day) {
        // TODO
        seznamSvatku.setSvatky(seznamSvatku.getSvatky());

        return Stream.of(seznamSvatku)
                .filter(Svatek -> Svatek.getSvatky().getFirst().getDen().equals(day))
                .map(Svatek -> seznamSvatku.getSvatky().getFirst().getJmeno())
                .toList();

         /* Stream<SeznamSvatku> seznamSvatkuStream = (Stream<SeznamSvatku>) seznamSvatku;
        return seznamSvatkuStream
                .filter(Svatek -> Svatek.getSvatky().getFirst().getDen().equals(day))
                .map(Svatek -> seznamSvatku.getSvatky().getFirst().getJmeno())
                .toList();*/

    }
}
