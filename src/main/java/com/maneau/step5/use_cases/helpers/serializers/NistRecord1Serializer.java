package com.maneau.step5.use_cases.helpers.serializers;

import com.maneau.step5.use_cases.helpers.builders.NistRecord1BuilderImpl;

public class NistRecord1Serializer
        extends AbstractNistRecordSerializer
        implements NistRecordReader, NistRecordWriter {

    public NistRecord1Serializer() {
        super(new NistRecord1BuilderImpl());
    }
}
