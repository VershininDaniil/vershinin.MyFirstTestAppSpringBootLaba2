package ru.vershinin.MyFirstTestAppSpringBootLaba2.exception;

public class UnsupportedCodeException extends RuntimeException {
    public UnsupportedCodeException(String message) {
        super(message);
    }
}
