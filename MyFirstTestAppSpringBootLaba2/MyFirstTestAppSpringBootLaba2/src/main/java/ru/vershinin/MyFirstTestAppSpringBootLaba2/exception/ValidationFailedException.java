package ru.vershinin.MyFirstTestAppSpringBootLaba2.exception;

public class ValidationFailedException extends Throwable {
    public ValidationFailedException(String message) {super(message); }
}
