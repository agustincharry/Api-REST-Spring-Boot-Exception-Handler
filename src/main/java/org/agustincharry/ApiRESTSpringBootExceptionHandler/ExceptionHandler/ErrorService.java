package org.agustincharry.ApiRESTSpringBootExceptionHandler.ExceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ErrorService {

    public ResponseEntity<ErrorModel> errorResponse (ErrorModel error){
        return ResponseEntity.status(error.getStatus()).body(error);
    }
}
