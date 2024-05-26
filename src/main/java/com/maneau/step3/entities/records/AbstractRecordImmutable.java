package com.maneau.step3.entities.records;

import lombok.Data;
import lombok.Singular;

import java.util.Collections;
import java.util.Map;

@Data
public abstract class AbstractRecordImmutable {
    @Singular
    private final Map<Integer, String> fields;

    protected AbstractRecordImmutable(Map<Integer, String> fields) {
        this.fields = Collections.unmodifiableMap(fields);
    }

}
