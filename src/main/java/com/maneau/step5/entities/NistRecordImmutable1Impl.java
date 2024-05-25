package com.maneau.step5.entities;

public class NistRecordImmutable1Impl extends AbstractRecordImmutable implements NistRecord {

    public NistRecordImmutable1Impl(NistRecordBuilder recordBuilder) {
        super(recordBuilder.getFields());
    }
}
