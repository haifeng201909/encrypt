package com.haifeng.encrypt.tools;

import com.haifeng.encrypt.EncryptorConfig;
import com.haifeng.encrypt.EncryptorFactory;
import com.haifeng.encrypt.keygen.KeyGenerators;
import com.haifeng.encrypt.utils.FileUtils;

public class EncryptorTool {

    public static void main(String[] args) {

        EncryptorConfig encryptorConfig = EncryptorFactory.getEncryptConfig();

        String keyFactor = EncryptorFactory.getEncryptConfig().getReversibleKeyFactor();
        if (keyFactor == null || "".equals(keyFactor)) {
            keyFactor = generateKeyFactor(encryptorConfig);
        }
        System.out.println(keyFactor);
    }

    public static String generateKeyFactor(EncryptorConfig encryptorConfig) {
        String keyFactor = KeyGenerators.string(16).generateKey();
        encryptorConfig.setReversibleKeyFactor(keyFactor);
        String path = EncryptorTool.class.getClassLoader().getResource(
                "config/key-factor.properties").getPath();
        FileUtils.write("encryption.key.factor=" + keyFactor, path);
        return keyFactor;
    }

}
