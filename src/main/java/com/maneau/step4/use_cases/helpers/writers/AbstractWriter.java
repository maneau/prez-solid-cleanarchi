package com.maneau.step4.use_cases.helpers.writers;

import com.maneau.step4.entities.AbstractRecord;
import lombok.AllArgsConstructor;

import java.util.Map;

import static java.lang.String.format;

@AllArgsConstructor
public abstract class AbstractWriter<R extends AbstractRecord> {

    public String write(R record) {

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
