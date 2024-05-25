package com.maneau.step5.entities;

public class NistRecordImmutable2Impl
        extends AbstractRecordImmutable
        implements NistRecord {

    public NistRecordImmutable2Impl(NistRecordBuilder nistRecordBuilder) {
        super(nistRecordBuilder.getFields());
    }
}
