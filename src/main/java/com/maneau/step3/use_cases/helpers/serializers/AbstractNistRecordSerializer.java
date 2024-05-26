package com.maneau.step3.use_cases.helpers.serializers;

import com.maneau.step3.entities.records.NistRecord;
import com.maneau.step3.entities.records.NistRecordBuilder;
import lombok.AllArgsConstructor;

import java.util.Map;

import static java.lang.String.format;

@AllArgsConstructor
public abstract class AbstractNistRecordSerializer {

    private final NistRecordBuilder builder;

    public NistRecord read(String value) {
        NistRecordBuilder recordBuilder = builder.newBuilder();
        String[] values = value.split(",");
        for(int i=0; i<values.length; i++) {
            String[] tokens = values[i].split(":");
            recordBuilder.withField(Integer.valueOf(tokens[0]), tokens[1]);
        }
        return recordBuilder.build();
    }

    public String write(NistRecord record) {

        StringBuilder stringBuilder = new StringBuilder();
        boolean isFirst = true;
        for(Map.Entry<Integer, String> entry : record.getFields().entrySet()) {
            if(isFirst) {
                isFirst = false;
            } else {
                stringBuilder.append(",");
            }
            stringBuilder.append(format("%s:%s",
                    entry.getKey(),
                    entry.getValue())
            );
        }
        return stringBuilder.toString();
    }

}
