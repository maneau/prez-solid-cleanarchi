package com.maneau.step5.entities;

import java.util.Map;

public interface NistRecordBuilder {
     NistRecord build();
     NistRecordBuilder newBuilder();
     NistRecordBuilder withField(Integer integer, String token);
     NistRecordBuilder withBeforeBuild(Callback<NistRecordBuilder> callback);
     NistRecordBuilder from(NistRecord record);
     void setFields(Map<Integer, String> fields);
     Map<Integer, String> getFields();
}
