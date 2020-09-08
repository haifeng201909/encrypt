package com.haifeng.encrypt.test.keygen;

import com.haifeng.encrypt.keygen.KeyGenerators;

import java.util.Arrays;

public class KeyGeneratorsTest {

    public static void main(String[] args) {
        byte[] bs = KeyGenerators.getSecureKey();
        System.out.println(Arrays.toString(bs));
    }

}
