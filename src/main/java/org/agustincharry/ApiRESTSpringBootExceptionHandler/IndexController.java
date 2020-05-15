package org.agustincharry.ApiRESTSpringBootExceptionHandler;

import org.agustincharry.ApiRESTSpringBootExceptionHandler.ExceptionHandler.Exceptions.BadRequestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class IndexController {

    @GetMapping
    public String getEmployees(){
        return "Hola Mundo";
    }

    @GetMapping("/qq")
    public String myError() throws Exception {
        throw new BadRequestException("Body mal formado");
    }
}
