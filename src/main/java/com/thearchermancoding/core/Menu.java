package com.thearchermancoding.core;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * The type Menu.
 */
public class Menu {
    private ArrayList<MenuItem> menu;

    /**
     * Instantiates a new Menu.
     */
    public Menu() {
        this(new ArrayList<MenuItem>());
    }

    /**
     * Instantiates a new Menu.
     *
     * @param menu the menu
     */
    public Menu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    /**
     * Instantiates a new Menu.
     *
     * @param path the path
     */
    public Menu(String path) {
        JSONParser parser = new JSONParser();
        try {
            JSONArray items = (JSONArray) parser.parse(new FileReader(System.getProperty("user.dir") + "\\src\\main\\resources\\com\\thearchermancoding\\" + path));
            for (Object item : items) {
                menu.add(MenuItem.fromJSON((JSONObject) item));
            }
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Add menu item.
     *
     * @param item the item
     */
    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    /**
     * Gets item.
     *
     * @param id the id
     * @return the item
     */
    public MenuItem getItem(int id) {
        return menu.get(id);
    }
}
