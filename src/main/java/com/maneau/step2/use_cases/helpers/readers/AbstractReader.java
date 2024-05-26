package com.maneau.step2.use_cases.helpers.readers;

import com.maneau.step2.entities.AbstractRecord;
import com.maneau.step2.use_cases.helpers.builders.AbstractRecordBuilder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class AbstractReader<
        R extends AbstractRecord,
        B extends AbstractRecordBuilder
        > {

    private final B builder;

    public R read(String value) {
        AbstractRecordBuilder<R> recordBuilder = builder.newBuilder();
        String[] values = value.split(",");
        for(int i=0; i<values.length; i++) {
            String[] tokens = values[i].split(":");
            recordBuilder.withField(Integer.valueOf(tokens[0]), tokens[1]);
        }
        return recordBuilder.build();
    }

}
