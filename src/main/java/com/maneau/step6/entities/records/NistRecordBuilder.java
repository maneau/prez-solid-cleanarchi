package com.maneau.step6.entities.records;

public interface NistRecordBuilder {
     NistRecord build();
     NistRecordBuilder newBuilder();
     NistRecordBuilder withField(Integer integer, String token);
}
