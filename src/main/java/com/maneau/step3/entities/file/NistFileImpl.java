package com.maneau.step3.entities.file;

import com.maneau.step3.entities.records.NistRecord;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class NistFileImpl implements NistFile {

    private final NistRecord record1;
    private final NistRecord record2;
}
