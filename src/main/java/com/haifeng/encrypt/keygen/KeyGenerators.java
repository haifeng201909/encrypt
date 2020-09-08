package com.haifeng.encrypt.keygen;

import java.security.SecureRandom;

public class KeyGenerators {

    private KeyGenerators(){}

    private static final int DEFAULT_KEY_LENGTH = 8;

    /**
     * 生成默认长度的 byte数组
     */
    public static byte[] getSecureKey(){
        byte[] byteKey = new byte[DEFAULT_KEY_LENGTH];
        SecureRandom random = new SecureRandom();
        random.nextBytes(byteKey);
        return byteKey;
    }

    /**
     * 生成指定长度的安全随机数
     * @param length
     * @return
     */
    public static byte[] getSecureKey(int length){
        byte[] byteKey = new byte[length];
        SecureRandom random = new SecureRandom();
        random.nextBytes(byteKey);
        return byteKey;
    }

}
