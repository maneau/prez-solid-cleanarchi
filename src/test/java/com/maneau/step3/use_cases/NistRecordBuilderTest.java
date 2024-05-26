package com.maneau.step3.use_cases;

import com.maneau.step3.entities.records.NistRecord;
import com.maneau.step3.use_cases.helpers.builders.NistRecord1BuilderImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NistRecordBuilderTest {

    @Test
    void NistRecord_should_permit_create_another_version() {
        // Given
        NistRecord recordOriginal = new NistRecord1BuilderImpl()
                .withField(1, "test 1")
                .withField(2, "test 2")
                .build();

        // When
        NistRecord recordModify = recordOriginal;
        recordModify.getFields().remove(1);
        recordModify.getFields().put(3, "test 3");

        // Then
        assertThat(recordModify.getFields().get(3)).isEqualTo("test 3");
        assertThat(recordModify.getFields().get(2)).isEqualTo("test 2");
        assertThat(recordModify.getFields().get(1)).isNull();

        /*Voir plus tard (Clonable, DeepCopy)
        assertThat(recordOriginal.getFields().get(1)).isEqualTo("test 1");
        assertThat(recordOriginal.getFields().get(2)).isEqualTo("test 2");
        assertThat(recordOriginal.getFields().get(3)).isNull();
        */
    }

}
