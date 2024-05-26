package com.maneau.step4.use_cases.helpers.serializers;

import com.maneau.step4.use_cases.helpers.builders.Record1BuilderImpl;

public class NistRecord1Serializer
        extends AbstractNistRecordSerializer
        implements NistRecordReader, NistRecordWriter {

    public NistRecord1Serializer() {
        super(new Record1BuilderImpl());
    }
}
