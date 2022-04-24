package com.unosquare.operation.domain.enums;

public enum OperationTypeEnum {
    USER_REGISTRATION("User registration"),
    CONFIRM_USER_ACCOUNT("Confirm user account"),
    LOGIN("Login"),
    PASSWORD_UPDATE("Password update"),
    LOGOUT("Logout");

    public final String label;

    private OperationTypeEnum(String label) {
        this.label = label;
    }
}
