package com.maneau.step2.entities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class NistFile {
    private final Record1 record1;
    private final Record2 record2;
}
