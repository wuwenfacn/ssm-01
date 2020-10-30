package com.fa.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceException extends RuntimeException {
    private Integer status;
    public ServiceException(String message,int status){
        super(message);
        this.status = status;
    }
}
