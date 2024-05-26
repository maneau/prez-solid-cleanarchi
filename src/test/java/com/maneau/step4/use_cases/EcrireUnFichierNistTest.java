package com.maneau.step4.use_cases;

import com.maneau.step4.entities.file.NistFileImpl;
import com.maneau.step4.entities.records.NistRecord;
import com.maneau.step4.use_cases.helpers.builders.NistRecord1BuilderImpl;
import com.maneau.step4.use_cases.helpers.builders.NistRecord2BuilderImpl;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

class EcrireUnFichierNistTest {
    com.maneau.step4.use_cases.EcrireUnFichierNist ecrireUnFichierNist = new EcrireUnFichierNist();

    @Test
    void ecrireUnFichierNist_devrait_ecrire() throws Exception {
        //Given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        NistRecord record1 = new NistRecord1BuilderImpl()
                .withField(1, "field 11")
                .withField(2, "field 12")
                .build();

        NistRecord record2 = new NistRecord2BuilderImpl()
                .withField(1, "field 21")
                .withField(2, "field 22")
                .build();

        NistFileImpl nistFileImpl = NistFileImpl.builder()
                .record1(record1)
                .record2(record2)
                .build();

        //When
        ecrireUnFichierNist.executer(outputStream, nistFileImpl);

        //Then
        String value = outputStream.toString(StandardCharsets.UTF_8);
        assertThat(value).isNotEmpty();
        assertThat(value).isEqualTo("1:field 11,2:field 12#1:field 21,2:field 22");
    }
}