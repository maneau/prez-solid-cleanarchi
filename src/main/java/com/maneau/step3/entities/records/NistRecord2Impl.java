package com.maneau.step3.entities.records;

import com.maneau.step3.use_cases.helpers.builders.NistRecord2BuilderImpl;

public class NistRecord2Impl
        extends AbstractNistRecord
        implements NistRecord {

    public NistRecord2Impl(NistRecord2BuilderImpl record2BuilderImpl) {
        super(record2BuilderImpl.getFields());
    }
}
