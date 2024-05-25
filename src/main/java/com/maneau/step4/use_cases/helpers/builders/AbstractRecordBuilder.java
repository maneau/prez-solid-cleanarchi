package com.maneau.step4.use_cases.helpers.builders;

import com.maneau.step4.entities.AbstractRecord;
import lombok.Getter;

import java.util.Map;
import java.util.TreeMap;

public abstract class AbstractRecordBuilder<T extends AbstractRecord> {

    @Getter
    private Map<Integer, String> fields;

    public abstract T build();

    AbstractRecordBuilder() {
      this.fields = new TreeMap<>();
    }

    public AbstractRecordBuilder<T> withField(Integer key, String value) {
        fields.put(key, value);
        return this;
    }

    public abstract AbstractRecordBuilder<T> newBuilder();
}
