package com.maneau.step4.entities.records;

import com.maneau.step4.use_cases.helpers.builders.Record2BuilderImpl;

public class NistRecord2Impl
        extends AbstractNistRecord
        implements NistRecord {

    public NistRecord2Impl(Record2BuilderImpl record2BuilderImpl) {
        super(record2BuilderImpl.getFields());
    }
}
