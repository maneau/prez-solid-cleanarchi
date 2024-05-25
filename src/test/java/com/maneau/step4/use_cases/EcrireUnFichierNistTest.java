package com.maneau.step4.use_cases;

import com.maneau.step4.entities.NistFile;
import com.maneau.step4.entities.Record1;
import com.maneau.step4.entities.Record2;
import com.maneau.step4.use_cases.helpers.builders.Record1Builder;
import com.maneau.step4.use_cases.helpers.builders.Record2Builder;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

class EcrireUnFichierNistTest {
    EcrireUnFichierNist ecrireUnFichierNist = new EcrireUnFichierNist();

    @Test
    void ecrireUnFichierNist_devrait_ecrire() throws Exception {
        //Given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Record1 record1 = new Record1Builder()
                .withField(1, "field 11")
                .withField(2, "field 12")
                .build();

        Record2 record2 = new Record2Builder()
                .withField(1, "field 21")
                .withField(2, "field 22")
                .build();

        NistFile nistFile = NistFile.builder()
                .record1(record1)
                .record2(record2)
                .build();

        //When
        ecrireUnFichierNist.executer(outputStream, nistFile);

        //Then
        String value = outputStream.toString(StandardCharsets.UTF_8);
        assertThat(value).isNotEmpty();
        assertThat(value).isEqualTo("1:field 11,2:field 12#1:field 21,2:field 22");
    }
}