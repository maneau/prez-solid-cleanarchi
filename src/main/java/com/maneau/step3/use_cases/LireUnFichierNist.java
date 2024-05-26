package com.maneau.step3.use_cases;

import com.maneau.step3.entities.file.NistFileImpl;
import com.maneau.step3.use_cases.helpers.serializers.NistRecord1Serializer;
import com.maneau.step3.use_cases.helpers.serializers.NistRecord2Serializer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class LireUnFichierNist {

    NistRecord1Serializer record1Serializer = new NistRecord1Serializer();
    NistRecord2Serializer record2Serializer = new NistRecord2Serializer();

    public NistFileImpl executer(InputStream inputStream) throws IOException {
        NistFileImpl.NistFileImplBuilder nistFileBuilder = NistFileImpl.builder();
        String text = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        String[] textRecords = text.split("#");

        nistFileBuilder.record1(record1Serializer.read(textRecords[0]));
        nistFileBuilder.record2(record2Serializer.read(textRecords[1]));

        return nistFileBuilder.build();
    }
}
