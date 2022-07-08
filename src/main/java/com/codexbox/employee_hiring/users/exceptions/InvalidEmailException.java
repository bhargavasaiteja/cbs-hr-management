package com.codexbox.employee_hiring.users.exceptions;

public class InvalidEmailException extends RuntimeException {

    public InvalidEmailException(String message) {
        super(message);
    }

}
