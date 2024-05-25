package com.maneau.step6.use_cases;

import com.maneau.step6.entities.file.NistFileImpl;
import com.maneau.step6.use_cases.helpers.serializers.NistRecord1Serializer;
import com.maneau.step6.use_cases.helpers.serializers.NistRecord2Serializer;
import lombok.NonNull;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class EcrireUnFichierNist {

    NistRecord1Serializer record1Serializer = new NistRecord1Serializer();
    NistRecord2Serializer record2Serializer = new NistRecord2Serializer();

    public void executer(@NonNull OutputStream os, NistFileImpl nistFileImpl) throws IOException {
        os.write(record1Serializer.write(nistFileImpl.getRecord1()).getBytes(StandardCharsets.UTF_8));
        os.write("#".getBytes(StandardCharsets.UTF_8));
        os.write(record2Serializer.write(nistFileImpl.getRecord2()).getBytes(StandardCharsets.UTF_8));
    }

}
