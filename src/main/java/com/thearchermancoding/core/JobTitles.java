package com.thearchermancoding.core;

/**
 * The enum Job titles.
 */
public enum JobTitles {
    BARISTA("barista"), MANAGER("manager");

    private final String title;
    JobTitles(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "JobTitles{" +
                "title='" + title + '\'' +
                '}';
    }
}
