package com.maneau.step5.use_cases.helpers.builders;

import com.maneau.step5.entities.Callback;
import com.maneau.step5.entities.NistRecord;
import com.maneau.step5.entities.NistRecordBuilder;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

public abstract class AbstractNistRecordBuilder implements NistRecordBuilder {

    @Getter
    @Setter
    private Map<Integer, String> fields;

    protected List<Callback<NistRecordBuilder>> beforeBuildCallbacks;

    public abstract NistRecord build();

    AbstractNistRecordBuilder() {
        this.fields = new TreeMap<>();
        this.beforeBuildCallbacks = new ArrayList<>();
    }

    public NistRecordBuilder withField(Integer key, String value) {
        fields.put(key, value);
        return this;
    }

    public abstract NistRecordBuilder newBuilder();

    public NistRecordBuilder from(NistRecord immutableRecord) {
        NistRecordBuilder builder = newBuilder();
        Map<Integer, String> mutableFields = new HashMap<>(immutableRecord.getFields());
        builder.setFields(mutableFields);
        return builder;
    }

    public NistRecordBuilder withBeforeBuild(Callback<NistRecordBuilder> callback) {
        this.beforeBuildCallbacks.add(callback);
        return this;
    }
}
