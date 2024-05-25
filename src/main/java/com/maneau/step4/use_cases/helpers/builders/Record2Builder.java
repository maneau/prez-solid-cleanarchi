package com.maneau.step4.use_cases.helpers.builders;

import com.maneau.step4.entities.Record2;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Record2Builder extends AbstractRecordBuilder<Record2> {

    public Record2 build() {
        return new Record2(this);
    }

    public Record2Builder newBuilder() {
        return new Record2Builder();
    }
}
