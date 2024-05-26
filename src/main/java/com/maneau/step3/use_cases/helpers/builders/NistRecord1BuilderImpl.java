package com.maneau.step3.use_cases.helpers.builders;

import com.maneau.step3.entities.records.NistRecord1Impl;
import com.maneau.step3.entities.records.NistRecordBuilder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NistRecord1BuilderImpl
        extends AbstractNistRecordBuilder
        implements NistRecordBuilder {

    public NistRecord1Impl build() {
        return new NistRecord1Impl(this);
    }

    public NistRecord1BuilderImpl newBuilder() {
        return new NistRecord1BuilderImpl();
    }
}
