package com.maneau.step4.entities;

import lombok.Data;
import lombok.Singular;

import java.util.Map;

@Data
public abstract class AbstractRecord {
    @Singular
    private final Map<Integer, String> fields;

    protected AbstractRecord(Map<Integer, String> fields) {
        this.fields = fields;
    }

}
