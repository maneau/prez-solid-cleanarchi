package com.maneau.step3.use_cases.helpers.builders;

import com.maneau.step3.entities.records.NistRecord2Impl;
import com.maneau.step3.entities.records.NistRecordBuilder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NistRecord2BuilderImpl
        extends AbstractNistRecordBuilder
        implements NistRecordBuilder {

    public NistRecord2Impl build() {
        return new NistRecord2Impl(this);
    }

    public NistRecord2BuilderImpl newBuilder() {
        return new NistRecord2BuilderImpl();
    }
}
