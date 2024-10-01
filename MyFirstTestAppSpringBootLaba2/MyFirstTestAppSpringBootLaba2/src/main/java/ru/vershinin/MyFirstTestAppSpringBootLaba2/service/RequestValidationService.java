package ru.vershinin.MyFirstTestAppSpringBootLaba2.service;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.vershinin.MyFirstTestAppSpringBootLaba2.exception.ValidationFailedException;

@Service
public class RequestValidationService implements ValidationService {
    @Override
    public void isVAlid(BindingResult bindingResult) throws ValidationFailedException {

    }

    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException {
        if (bindingResult.hasErrors()) {
            throw new
                    ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }
}
