package com.maneau.step6.entities.records;

import com.maneau.step6.use_cases.helpers.builders.Record1BuilderImpl;

public class NistRecord1Impl extends AbstractNistRecord implements NistRecord {

    public NistRecord1Impl(Record1BuilderImpl record1Builder) {
        super(record1Builder.getFields());
    }
}
