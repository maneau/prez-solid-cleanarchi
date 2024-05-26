package com.maneau.step3.use_cases.helpers.builders;

import com.maneau.step3.entities.records.NistRecordImmutable2Impl;
import com.maneau.step3.entities.records.NistRecordBuilder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NistRecord2BuilderImpl
        extends AbstractNistRecordBuilder
        implements NistRecordBuilder {

    public NistRecordImmutable2Impl build() {
        return new NistRecordImmutable2Impl(this);
    }

    public NistRecord2BuilderImpl newBuilder() {
        return new NistRecord2BuilderImpl();
    }
}
