package com.maneau.step3.entities.records;

import lombok.Data;

import java.util.Map;
import java.util.stream.Collectors;

@Data
public abstract class AbstractNistRecord {
    private final Map<Integer, String> fields;

    protected AbstractNistRecord(Map<Integer, String> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return fields.entrySet()
                .stream()
                .map(f -> f.getKey() + ":" + f.getValue())
                .collect(Collectors.joining(","));
    }
}
