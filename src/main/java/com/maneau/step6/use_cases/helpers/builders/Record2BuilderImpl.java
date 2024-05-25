package com.maneau.step6.use_cases.helpers.builders;

import com.maneau.step6.entities.records.NistRecord2Impl;
import com.maneau.step6.entities.records.NistRecordBuilder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Record2BuilderImpl
        extends AbstractNistRecordBuilder
        implements NistRecordBuilder {

    public NistRecord2Impl build() {
        return new NistRecord2Impl(this);
    }

    public Record2BuilderImpl newBuilder() {
        return new Record2BuilderImpl();
    }
}
