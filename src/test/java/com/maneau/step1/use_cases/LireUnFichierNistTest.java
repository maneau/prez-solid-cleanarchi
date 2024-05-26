package com.maneau.step1.use_cases;

import com.maneau.step1.entities.NistFile;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class LireUnFichierNistTest {
    LireUnFichierNist lireUnFichierNist = new LireUnFichierNist();

    @Test
    void executer_devrait_fonctionner() throws Exception {
        // Given
        String text = "1:field 11,2:field 12#1:field 21,2:field 22";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
        // When
        NistFile nistFile = lireUnFichierNist.executer(inputStream);

        // Then
        assertThat(nistFile).isNotNull();
        assertThat(nistFile.getRecord1()).isNotNull();//{Integer@1978} 1 -> 1:field 11,2:field 12
        assertThat(nistFile.getRecord1().getFields()).isEqualTo(Map.of(1, "field 11", 2, "field 12"));
        assertThat(nistFile.getRecord2().getFields()).isEqualTo(Map.of(1, "field 21", 2, "field 22"));
    }
}