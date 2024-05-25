package com.maneau.step6.use_cases.helpers.builders;

import com.maneau.step6.entities.records.NistRecord1Impl;
import com.maneau.step6.entities.records.NistRecordBuilder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Record1BuilderImpl
        extends AbstractNistRecordBuilder
        implements NistRecordBuilder {

    public NistRecord1Impl build() {
        return new NistRecord1Impl(this);
    }

    public Record1BuilderImpl newBuilder() {
        return new Record1BuilderImpl();
    }
}
