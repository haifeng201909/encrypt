package com.haifeng.encrypt.exception;

public class EncryptRuntimeException extends RuntimeException{
    public EncryptRuntimeException() {
    }

    public EncryptRuntimeException(String message) {
        super(message);
    }

    public EncryptRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public EncryptRuntimeException(Throwable cause) {
        super(cause);
    }

    public EncryptRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
