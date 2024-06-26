package com.maneau.step2.use_cases.helpers.readers;

import com.maneau.step2.entities.Record2;
import com.maneau.step2.use_cases.helpers.builders.Record2Builder;

public class Record2Reader extends AbstractReader<Record2, Record2Builder>{
    public Record2Reader(Record2Builder builder) {
        super(builder);
    }
}
