package com.example.ubuntu.myapplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ubuntu on 1/3/18.
 */

public class StroreImage {

    FileOutputStream fop = null;
    File file;
    String path;

    public StroreImage(FileOutputStream fop, String path) {
        this.fop = fop;
        this.path = path;

        try {

            file = new File(path);
            fop = new FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}