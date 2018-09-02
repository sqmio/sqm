package io.sqm.app.resource.exception;

import org.springframework.core.NestedRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such request")
public class RequestNotFoundException extends NestedRuntimeException {

    public RequestNotFoundException(String msg) {
        super(msg);
    }
}
