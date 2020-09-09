package com.haifeng.encrypt.codec;

import org.apache.commons.codec.DecoderException;

public class Hex {

    public static String encode(byte[] bytes){
        String key = org.apache.commons.codec.binary.Hex.encodeHexString(bytes);
        return key.toUpperCase();
    }

    public static byte[] decode(String key){
        try {
            return org.apache.commons.codec.binary.Hex.decodeHex(key.toCharArray());
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        return null;
    }

}
