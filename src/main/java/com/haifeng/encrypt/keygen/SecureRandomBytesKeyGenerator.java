package com.haifeng.encrypt.keygen;

import java.security.SecureRandom;

public class SecureRandomBytesKeyGenerator implements BytesKeyGenerator {

    private final SecureRandom random;

    private final int length;

    private static final int DEFAULT_KEY_LENGTH = 8;

    public SecureRandomBytesKeyGenerator() {
        this(DEFAULT_KEY_LENGTH);
    }

    public SecureRandomBytesKeyGenerator(int length) {
        this.random = new SecureRandom();
        this.length = length;
    }

    public int getKeyLength() {
        return this.length;
    }

    public byte[] generateKey() {
        byte[] bytes = new byte[length];
        random.nextBytes(bytes);
        return bytes;
    }

    public byte[] generateKey(int keyLength){
        byte[] bytes = new byte[keyLength];
        random.nextBytes(bytes);
        return bytes;
    }
}
