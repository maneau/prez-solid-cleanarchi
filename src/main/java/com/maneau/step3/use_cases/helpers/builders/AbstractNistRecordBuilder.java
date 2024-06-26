package com.maneau.step3.use_cases.helpers.builders;

import com.maneau.step3.entities.records.NistRecord;
import com.maneau.step3.entities.records.NistRecordBuilder;
import lombok.Getter;

import java.util.Map;
import java.util.TreeMap;

public abstract class AbstractNistRecordBuilder implements NistRecordBuilder {

    @Getter
    private final Map<Integer, String> fields;

    public abstract NistRecord build();

    AbstractNistRecordBuilder() {
      this.fields = new TreeMap<>();
    }

    public NistRecordBuilder withField(Integer key, String value) {
        fields.put(key, value);
        return this;
    }

    public abstract NistRecordBuilder newBuilder();
}
