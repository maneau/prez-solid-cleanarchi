package com.maneau.step3.use_cases;

import com.maneau.step3.entities.NistFile;
import lombok.NonNull;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class EcrireUnFichierNist {

    public void executer(@NonNull OutputStream os, NistFile nistFile) throws IOException {
        os.write(nistFile.getRecord1().toString().getBytes(StandardCharsets.UTF_8));
        os.write("#".getBytes(StandardCharsets.UTF_8));
        os.write(nistFile.getRecord2().toString().getBytes(StandardCharsets.UTF_8));
    }

}
