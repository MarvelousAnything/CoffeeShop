package com.thearchermancoding.core;

public enum OrderState {

    OPEN(true), CANCELLED(false), COMPLETED(false), REOPENED(true);

    private final boolean active;
    OrderState(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }
}
