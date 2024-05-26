package com.maneau.step4.use_cases.helpers.serializers;

import com.maneau.step4.use_cases.helpers.builders.Record1BuilderImpl;

public class NistRecord2Serializer
        extends AbstractNistRecordSerializer
        implements NistRecordReader, NistRecordWriter {

    public NistRecord2Serializer() {
        super(new Record1BuilderImpl());
    }
}
