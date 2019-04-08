package com.onevote.exception;

import lombok.Data;

import java.util.List;

@Data
public class OneVoteRuntimeException extends Exception{

    public OneVoteRuntimeException(String message) {
        super(message);
    }

    //General error message about nature of error
    private String message;
}
