package org.agustincharry.ApiRESTSpringBootExceptionHandler.ExceptionHandler;

import org.agustincharry.ApiRESTSpringBootExceptionHandler.ExceptionHandler.Exceptions.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

    @Autowired
    ErrorService errorService;

    @ExceptionHandler(BadRequestException.class)
    public final ResponseEntity<ErrorModel> handleUserNotFoundException(BadRequestException ex) {
        return errorService.errorResponse(ex.getError());
    }
}
