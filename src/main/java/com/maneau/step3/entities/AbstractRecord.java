package com.maneau.step3.entities;

import lombok.Data;
import lombok.Singular;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Data
public abstract class AbstractRecord {
    @Singular
    private final Map<Integer, String> fields;

    protected AbstractRecord() {
        fields = new TreeMap<>();
    }

    @Override
    public String toString() {
        return fields.entrySet()
                .stream()
                .map( f -> f.getKey() + ":" + f.getValue())
                .collect(Collectors.joining(","));
    }

    public <T extends AbstractRecord> T fromString(String value) {
        String[] values = value.split(",");
        for(int i=0; i<values.length; i++) {
            String[] tokens = values[i].split(":");
            this.fields.put(Integer.valueOf(tokens[0]), tokens[1]);
        }
        return (T)this;
    }
}
