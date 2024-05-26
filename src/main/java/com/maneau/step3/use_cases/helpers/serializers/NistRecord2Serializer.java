package com.maneau.step3.use_cases.helpers.serializers;

import com.maneau.step3.use_cases.helpers.builders.NistRecord1BuilderImpl;

public class NistRecord2Serializer
        extends AbstractNistRecordSerializer
        implements NistRecordReader, NistRecordWriter {

    public NistRecord2Serializer() {
        super(new NistRecord1BuilderImpl());
    }
}
