package com.maneau.step5.use_cases.helpers.builders;

import com.maneau.step5.entities.NistRecordImmutable1Impl;
import com.maneau.step5.entities.NistRecordBuilder;
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
