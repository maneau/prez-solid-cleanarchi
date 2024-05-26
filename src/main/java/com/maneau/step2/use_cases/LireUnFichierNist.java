package com.maneau.step2.use_cases;

import com.maneau.step2.entities.NistFile;
import com.maneau.step2.use_cases.helpers.builders.Record1Builder;
import com.maneau.step2.use_cases.helpers.builders.Record2Builder;
import com.maneau.step2.use_cases.helpers.readers.Record1Reader;
import com.maneau.step2.use_cases.helpers.readers.Record2Reader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class LireUnFichierNist {

    public NistFile executer(InputStream inputStream) throws IOException {
        NistFile.NistFileBuilder nistFileBuilder = NistFile.builder();
        String text = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        String[] textRecords = text.split("#");

        nistFileBuilder.record1(new Record1Reader(new Record1Builder()).read(textRecords[0]));
        nistFileBuilder.record2(new Record2Reader(new Record2Builder()).read(textRecords[1]));

        return nistFileBuilder.build();
    }
}
