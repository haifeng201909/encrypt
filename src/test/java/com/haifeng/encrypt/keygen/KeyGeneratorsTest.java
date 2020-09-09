package com.haifeng.encrypt.keygen;

import com.haifeng.encrypt.keygen.KeyGenerators;
import org.apache.commons.codec.binary.Hex;

import java.util.Arrays;

public class KeyGeneratorsTest {

    public static void main(String[] args) {

        StringKeyGenerator string = KeyGenerators.string();
        String key = string.generateKey();
        System.out.println(key);

        StringKeyGenerator string2 = KeyGenerators.string(16);
        String key2 = string2.generateKey();
        System.out.println(key2);

    }

}
