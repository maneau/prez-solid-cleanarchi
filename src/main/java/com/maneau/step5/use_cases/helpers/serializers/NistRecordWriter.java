package com.maneau.step5.use_cases.helpers.serializers;

import com.maneau.step5.entities.NistRecord;

public interface NistRecordWriter {
    String write(NistRecord record);
}
