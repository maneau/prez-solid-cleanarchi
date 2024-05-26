package com.maneau.step2.entities;

import com.maneau.step2.use_cases.helpers.builders.Record2Builder;

public class Record2 extends AbstractRecord {

    public Record2(Record2Builder record2Builder) {
        super(record2Builder.getFields());
    }
}
