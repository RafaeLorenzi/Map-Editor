package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.graphics.Grid;
import org.academiadecodigo.bootcamp.graphics.Cursor;

public class Playground {
    public static void main(String[] args) {
        Grid g = new Grid(15, 15);
        Cursor cursor = new Cursor(0, 0, g);
        ActionHandler handler = new ActionHandler(cursor, g);
        KeyboardManager.initKeyEvents(handler);
    }
}
