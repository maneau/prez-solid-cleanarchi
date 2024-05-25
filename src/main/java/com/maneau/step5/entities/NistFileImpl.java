package com.maneau.step5.entities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class NistFileImpl implements NistFile {

    private final NistRecord record1;
    private final NistRecord record2;
}
