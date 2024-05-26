package com.maneau.step4.entities.records;

public interface NistRecordBuilder {
     NistRecord build();
     NistRecordBuilder newBuilder();
     NistRecordBuilder withField(Integer integer, String token);
}
