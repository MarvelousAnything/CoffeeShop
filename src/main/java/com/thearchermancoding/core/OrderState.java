package com.thearchermancoding.core;

/**
 * The enum Order state.
 */
public enum OrderState {

    /**
     * Open order state.
     */
    OPEN(true),
    /**
     * Cancelled order state.
     */
    CANCELLED(false),
    /**
     * Completed order state.
     */
    COMPLETED(false),
    /**
     * Reopened order state.
     */
    REOPENED(true);

    private final boolean active;
    OrderState(boolean active) {
        this.active = active;
    }

    /**
     * Is active boolean.
     *
     * @return the boolean
     */
    public boolean isActive() {
        return active;
    }
}
