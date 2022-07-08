package com.codexbox.employee_hiring.users.exceptions;

public class UserIsSecuredException extends RuntimeException {

    public UserIsSecuredException(String message) {
        super(message);
    }

}
