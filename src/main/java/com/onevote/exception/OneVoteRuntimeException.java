package com.onevote.exception;



public class OneVoteRuntimeException extends Exception{

    public OneVoteRuntimeException(String message) {
        super(message);
        this.message = message;
    }

    //General error message about nature of error
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
