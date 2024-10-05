package ru.vershinin.MyFirstTestAppSpringBootLaba2.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.vershinin.MyFirstTestAppSpringBootLaba2.model.Codes;
import ru.vershinin.MyFirstTestAppSpringBootLaba2.model.ErrorCodes;
import ru.vershinin.MyFirstTestAppSpringBootLaba2.model.ErrorMessages;
import ru.vershinin.MyFirstTestAppSpringBootLaba2.model.Response;
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UnsupportedCodeException.class)
    public ResponseEntity<Response> handleUnsupportedCodeException(UnsupportedCodeException ex) {
        Response response = Response.builder()
                .code(Codes.FAILED)
                .errorcode(ErrorCodes.UNSUPPORTED_EXCEPTION)
                .errorMessage(ErrorMessages.UNSUPPORTED)
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response> handleGeneralException(Exception ex) {
        Response response = Response.builder()
                .code(Codes.FAILED)
                .errorcode(ErrorCodes.UNKNOWN_EXCEPTION)
                .errorMessage(ErrorMessages.UNKNOWN)
                .build();
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
