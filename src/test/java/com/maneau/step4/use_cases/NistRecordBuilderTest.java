package com.maneau.step4.use_cases;

import com.maneau.step4.entities.records.NistRecord;
import com.maneau.step4.use_cases.helpers.builders.NistRecord1BuilderImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NistRecordBuilderTest {

    @Test
    void NistRecord_should_be_immutable() {
        // Given
        NistRecord record = new NistRecord1BuilderImpl()
                .withField(1, "test 1")
                .withField(2, "test 2")
                .build();

        // When
        // Then
        assertThrows(UnsupportedOperationException.class, () -> record.getFields().remove(1));
        assertThrows(UnsupportedOperationException.class, () -> record.getFields().put(3,"test 3"));
    }

    @Test
    void from_should_permit_create_another_version() {
        // Given
        NistRecord recordOriginal = new NistRecord1BuilderImpl()
                .withField(1, "test 1")
                .withField(2, "test 2")
                .build();

        // When
        NistRecord recordModify = new NistRecord1BuilderImpl().from(recordOriginal)
                .withField(1, "new val on test 1")
                .withField(3, "test 3")
                .build();

        // Then
        assertThat(recordOriginal.getFields().get(1)).isEqualTo("test 1");
        assertThat(recordOriginal.getFields().get(2)).isEqualTo("test 2");
        assertThat(recordOriginal.getFields().get(3)).isNull();

        assertThat(recordModify.getFields().get(3)).isEqualTo("test 3");
        assertThat(recordModify.getFields().get(2)).isEqualTo("test 2");
        assertThat(recordModify.getFields().get(1)).isEqualTo("new val on test 1");
    }

    @Test
    void beforeBuild_should_be_call() {
        // Given
        NistRecord record = new NistRecord1BuilderImpl()
                .withField(3, "test 3")
                .withField(2, "test 2")
                .withBeforeBuild(value -> value.getFields().put(1, "count: " + value.getFields().size()))
                .build();

        // When
        // Then
        assertThat(record.getFields().get(3)).isEqualTo("test 3");
        assertThat(record.getFields().get(2)).isEqualTo("test 2");
        assertThat(record.getFields().get(1)).isEqualTo("count: 2");
    }
}
