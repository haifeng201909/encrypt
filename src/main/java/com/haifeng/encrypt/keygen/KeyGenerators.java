package com.haifeng.encrypt.keygen;

public class KeyGenerators {

    private KeyGenerators() {
    }

    public static BytesKeyGenerator secureRandom() {
        return new SecureRandomBytesKeyGenerator();
    }

    public static BytesKeyGenerator secureRandom(int length) {
        return new SecureRandomBytesKeyGenerator(length);
    }

    public static StringKeyGenerator string() {
        return new HexEncodingStringKeyGenerator(secureRandom());
    }

    public static StringKeyGenerator string(int keyLength) {
        return new HexEncodingStringKeyGenerator(secureRandom(keyLength));
    }

}
