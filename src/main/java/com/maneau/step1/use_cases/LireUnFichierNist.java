package com.maneau.step1.use_cases;

import com.maneau.step1.entities.NistFile;
import com.maneau.step1.entities.Record1;
import com.maneau.step1.entities.Record2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class LireUnFichierNist {

    public NistFile executer(InputStream inputStream) throws IOException {
        NistFile.NistFileBuilder nistFileBuilder = NistFile.builder();
        String text = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        String[] textRecords = text.split("#");

        nistFileBuilder.record1(new Record1().fromString(textRecords[0]));
        nistFileBuilder.record2(new Record2().fromString(textRecords[1]));

        return nistFileBuilder.build();
    }
}
