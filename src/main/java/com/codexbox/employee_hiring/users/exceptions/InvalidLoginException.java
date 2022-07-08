package com.codexbox.employee_hiring.users.exceptions;

public class InvalidLoginException extends RuntimeException {

    public InvalidLoginException(String message) {
        super(message);
    }

}
