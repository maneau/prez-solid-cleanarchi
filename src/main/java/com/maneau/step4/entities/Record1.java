package com.maneau.step4.entities;

import com.maneau.step4.use_cases.helpers.builders.Record1Builder;

public class Record1 extends AbstractRecord {

    public Record1(Record1Builder record1Builder) {
        super(record1Builder.getFields());
    }
}
