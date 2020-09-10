package com.haifeng.encrypt.utils;

import com.haifeng.encrypt.exception.EncryptRuntimeException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

    public static void write(String text, String path) {
        File file = new File(path);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try(FileWriter writer = new FileWriter(file)){
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            throw new EncryptRuntimeException(e);
        }
    }

}
