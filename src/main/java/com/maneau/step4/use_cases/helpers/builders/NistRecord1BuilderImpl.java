package com.maneau.step4.use_cases.helpers.builders;

import com.maneau.step4.entities.records.NistRecordImmutable1Impl;
import com.maneau.step4.entities.records.NistRecordBuilder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NistRecord1BuilderImpl
        extends AbstractNistRecordBuilder
        implements NistRecordBuilder {

    public NistRecordImmutable1Impl build() {
        this.beforeBuildCallbacks.forEach((callback) -> callback.execute(this));
        return new NistRecordImmutable1Impl(this);
    }

    public NistRecord1BuilderImpl newBuilder() {
        return new NistRecord1BuilderImpl();
    }
}
