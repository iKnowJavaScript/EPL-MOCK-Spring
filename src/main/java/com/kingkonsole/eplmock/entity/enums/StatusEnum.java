package com.kingkonsole.eplmock.entity.enums;

public enum StatusEnum {
    COMPLETED("COMPLETED"),
    PENDING("PENDING");

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    StatusEnum(String type) {
        this.type = type;
    }
}
