package org.agustincharry.ApiRESTSpringBootExceptionHandler.ExceptionHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {

    @Autowired
    ErrorService errorService;

    /**
     * Manejo de excepciones no controladas. Para controlar las excepcones ir a ExceptionHandlerController
     * @see ExceptionHandlerController
     */
    @RequestMapping("/error")
    @ResponseBody
    public ResponseEntity<ErrorModel> handleError(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
        String message = exception !=null ? exception.getMessage() : "";

        HttpStatus httpStatus = HttpStatus.valueOf(statusCode);
        ErrorModel error = new ErrorModel(httpStatus.value(), httpStatus.value() + "", httpStatus.name(), message);

        return errorService.errorResponse(error);
    }

    public String getErrorPath() {
        return "/error";
    }
}