package com.maneau.step3.entities.records;

import com.maneau.step3.use_cases.helpers.builders.NistRecord1BuilderImpl;

public class NistRecord1Impl extends AbstractNistRecord implements NistRecord {

    public NistRecord1Impl(NistRecord1BuilderImpl record1Builder) {
        super(record1Builder.getFields());
    }

}
