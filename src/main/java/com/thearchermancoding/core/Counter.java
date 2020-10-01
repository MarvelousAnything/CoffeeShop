package com.thearchermancoding.core;

public class Counter {
    private int count;

    public Counter() {
        this(0);
    }

    public Counter(int n) {
        this.count = n;
    }

    public int getCount() {
        return count;
    }

    public int getNext() {
        return count++;
    }

    public String toString() {
        return String.valueOf(this.count);
    }
}
