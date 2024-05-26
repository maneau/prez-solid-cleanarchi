package com.maneau.step4.entities.records;

public class NistRecordImmutable1Impl extends AbstractRecordImmutable implements NistRecord {

    public NistRecordImmutable1Impl(NistRecordBuilder recordBuilder) {
        super(recordBuilder.getFields());
    }
}
