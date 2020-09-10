package com.haifeng.encrypt;

public class EncryptorConfig {

    public static final String ENC_REVERSE_KEY_FACTOR = "encryption.key.factor";

    private String reversibleKeyFactor;

    public String getReversibleKeyFactor() {
        return reversibleKeyFactor;
    }

    public void setReversibleKeyFactor(String reversibleKeyFactor) {
        this.reversibleKeyFactor = reversibleKeyFactor;
    }
}
