package com.bdth.rure.base.exception;

/**
 * Created by Administrator on 2017/10/19.
 */
public class CustomException extends Exception{
    private String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
