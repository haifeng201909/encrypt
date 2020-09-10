package com.haifeng.encrypt;

import com.haifeng.encrypt.exception.EncryptRuntimeException;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class EncryptorFactory {

    private EncryptorFactory() {
    }

    private static EncryptorConfig encryptorConfig = new EncryptorConfig();

    static {
        initKeyFactor(encryptorConfig);
    }

    public static EncryptorConfig getEncryptConfig() {
        return encryptorConfig;
    }

    public static void initKeyFactor(EncryptorConfig encryptorConfig){
        String keyFactorPath = "config/key-factor.properties";
        try(InputStream inputStream = EncryptorFactory.class.getClassLoader().
                getResourceAsStream(keyFactorPath)){
            if (inputStream == null){
                throw new FileNotFoundException("File Not Found: " + keyFactorPath);
            }
            Properties properties = new Properties();
            properties.load(inputStream);
            encryptorConfig.setReversibleKeyFactor(
                    properties.getProperty(EncryptorConfig.ENC_REVERSE_KEY_FACTOR));
        }catch (Exception e){
            throw new EncryptRuntimeException(e);
        }
    }
}
