package com.haifeng.encrypt.keygen;

import com.haifeng.encrypt.codec.Hex;

public class HexEncodingStringKeyGenerator implements StringKeyGenerator {

    private final BytesKeyGenerator keyGenerator;

    public HexEncodingStringKeyGenerator(BytesKeyGenerator keyGenerator) {
        this.keyGenerator = keyGenerator;
    }

    public String generateKey() {
        return new String(Hex.encode(keyGenerator.generateKey()));
    }

}
