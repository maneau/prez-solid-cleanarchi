package com.maneau.step2.use_cases.helpers.readers;

import com.maneau.step2.entities.Record1;
import com.maneau.step2.use_cases.helpers.builders.Record1Builder;

public class Record1Reader extends AbstractReader<Record1, Record1Builder>{
    public Record1Reader(Record1Builder builder) {
        super(builder);
    }
}
