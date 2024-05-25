package com.maneau.step4.use_cases;

import com.maneau.step4.entities.NistFile;
import com.maneau.step4.use_cases.helpers.writers.Record1Writer;
import com.maneau.step4.use_cases.helpers.writers.Record2Writer;
import lombok.NonNull;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class EcrireUnFichierNist {

    Record1Writer record1Writer = new Record1Writer();
    Record2Writer record2Writer = new Record2Writer();

    public void executer(@NonNull OutputStream os, NistFile nistFile) throws IOException {
        os.write(record1Writer.write(nistFile.getRecord1()).getBytes(StandardCharsets.UTF_8));
        os.write("#".getBytes(StandardCharsets.UTF_8));
        os.write(record2Writer.write(nistFile.getRecord2()).getBytes(StandardCharsets.UTF_8));
    }

}
