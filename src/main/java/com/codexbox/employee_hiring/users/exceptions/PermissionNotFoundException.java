package com.codexbox.employee_hiring.users.exceptions;

public class PermissionNotFoundException extends RuntimeException {

    public PermissionNotFoundException(String message) {
        super(message);
    }

}
