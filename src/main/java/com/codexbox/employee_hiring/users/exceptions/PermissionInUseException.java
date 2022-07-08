package com.codexbox.employee_hiring.users.exceptions;

public class PermissionInUseException extends RuntimeException {

    public PermissionInUseException(String message) {
        super(message);
    }

}
