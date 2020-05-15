package org.agustincharry.ApiRESTSpringBootExceptionHandler.ExceptionHandler.Exceptions;

import org.agustincharry.ApiRESTSpringBootExceptionHandler.ExceptionHandler.ErrorModel;

public class BadRequestException extends RuntimeException {
    ErrorModel error;

    public BadRequestException(String message) {
        this.error = new ErrorModel(400, 400 + "", "Bad Request", message);
    }

    public ErrorModel getError() {
        return error;
    }
}
