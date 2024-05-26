package com.maneau.step3.entities.records;

public interface NistRecordBuilder {
     NistRecord build();
     NistRecordBuilder newBuilder();
     NistRecordBuilder withField(Integer integer, String token);
}
