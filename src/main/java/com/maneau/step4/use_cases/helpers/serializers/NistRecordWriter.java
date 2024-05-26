package com.maneau.step4.use_cases.helpers.serializers;

import com.maneau.step4.entities.records.NistRecord;

public interface NistRecordWriter {
    String write(NistRecord record);
}
