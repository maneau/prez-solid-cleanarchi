package com.maneau.step3.use_cases.helpers.serializers;

import com.maneau.step3.entities.records.NistRecord;

public interface NistRecordWriter {
    String write(NistRecord record);
}
