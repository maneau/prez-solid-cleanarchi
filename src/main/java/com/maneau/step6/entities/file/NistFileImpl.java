package com.maneau.step6.entities.file;

import com.maneau.step6.entities.records.NistRecord;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class NistFileImpl implements NistFile {

    private final NistRecord record1;
    private final NistRecord record2;
}
