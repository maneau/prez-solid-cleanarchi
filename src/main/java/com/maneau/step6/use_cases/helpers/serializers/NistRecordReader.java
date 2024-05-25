package com.maneau.step6.use_cases.helpers.serializers;

import com.maneau.step6.entities.records.NistRecord;

public interface NistRecordReader {
    NistRecord read(String value);
}
