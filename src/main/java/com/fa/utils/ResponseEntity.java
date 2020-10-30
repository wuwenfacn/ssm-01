package com.fa.utils;

import lombok.Builder;
import lombok.Data;

@Data
/*@Builder*/
public class ResponseEntity<T> {
    private int status;
    private String message;
    private T data;

    public ResponseEntity() {
    }

    public static <T> ResponseEntity<T> success(T data) {
        ResponseEntity<Object> entity = new ResponseEntity<>();
        entity.setData(data);
        entity.setMessage(ErrorStatus.SUCCESS.getMessage());
        entity.setStatus(ErrorStatus.SUCCESS.getStatus());
        return (ResponseEntity<T>)entity;
        /*return (ResponseEntity<T>) ResponseEntity
                .builder()
                .data(data)
                .message(ErrorStatus.SUCCESS.getMessage())
                .status(ErrorStatus.SUCCESS.getStatus())
                .build();*/
    }
    
    public static <T> ResponseEntity<T> success(ErrorStatus errorStatus, T data) {
        ResponseEntity<Object> entity = new ResponseEntity<>();
        entity.setData(data);
        entity.setMessage(errorStatus.getMessage());
        entity.setStatus(errorStatus.getStatus());
        return (ResponseEntity<T>)entity;
        /*return (ResponseEntity<T>) ResponseEntity
                .builder()
                .data(data)
                .message(errorStatus.getMessage())
                .status(errorStatus.getStatus())
                .build();*/
    }

    public static <T> ResponseEntity<T> error() {
        ResponseEntity<Object> entity = new ResponseEntity<>();
        entity.setMessage(ErrorStatus.SYS_ERROR.getMessage());
        entity.setStatus(ErrorStatus.SYS_ERROR.getStatus());
        return (ResponseEntity<T>)entity;
        /*return (ResponseEntity<T>) ResponseEntity
                .builder()
                .message(ErrorStatus.SYS_ERROR.getMessage())
                .status(ErrorStatus.SYS_ERROR.getStatus())
                .build();*/
    }

    public static <T> ResponseEntity<T> error(ErrorStatus errorStatus) {
        ResponseEntity<Object> entity = new ResponseEntity<>();
        entity.setMessage(errorStatus.getMessage());
        entity.setStatus(errorStatus.getStatus());
        return (ResponseEntity<T>)entity;
        /*return (ResponseEntity<T>) ResponseEntity
                .builder()
                .message(errorStatus.getMessage())
                .status(errorStatus.getStatus())
                .build();*/
    }

}
