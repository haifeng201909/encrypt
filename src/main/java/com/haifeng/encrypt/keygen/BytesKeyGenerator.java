package com.haifeng.encrypt.keygen;

public interface BytesKeyGenerator {

    /**
     *
     * @return
     */

    int getKeyLength();
    /**
     *
     * @return
     */
    byte[] generateKey();

}
