package ru.vershinin.MyFirstTestAppSpringBootLaba2.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.vershinin.MyFirstTestAppSpringBootLaba2.exception.ValidationFailedException;
@Service
public interface ValidationService {
    void isVAlid(BindingResult bindingResult) throws ValidationFailedException;

    void isValid(BindingResult bindingResult) throws ValidationFailedException;
}
