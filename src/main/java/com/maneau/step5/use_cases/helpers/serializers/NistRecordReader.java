package com.maneau.step5.use_cases.helpers.serializers;

import com.maneau.step5.entities.NistRecord;

public interface NistRecordReader {
    NistRecord read(String value);
}
