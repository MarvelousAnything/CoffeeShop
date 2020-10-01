package com.thearchermancoding.core;

/**
 * The type Counter.
 */
public class Counter {
    private int count;

    /**
     * Instantiates a new Counter.
     */
    public Counter() {
        this(0);
    }

    /**
     * Instantiates a new Counter.
     *
     * @param n the n
     */
    public Counter(int n) {
        this.count = n;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * Gets next.
     *
     * @return the next
     */
    public int getNext() {
        return count++;
    }

    public String toString() {
        return String.valueOf(this.count);
    }
}
