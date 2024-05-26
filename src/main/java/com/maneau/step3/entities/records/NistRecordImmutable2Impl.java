package com.maneau.step3.entities.records;

public class NistRecordImmutable2Impl
        extends AbstractRecordImmutable
        implements NistRecord {

    public NistRecordImmutable2Impl(NistRecordBuilder nistRecordBuilder) {
        super(nistRecordBuilder.getFields());
    }
}
