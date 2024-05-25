package com.maneau.step4.use_cases.helpers.builders;

import com.maneau.step4.entities.Record1;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Record1Builder extends AbstractRecordBuilder<Record1> {

    public Record1 build() {
        return new Record1(this);
    }

    public Record1Builder newBuilder() {
        return new Record1Builder();
    }
}
