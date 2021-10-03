package me.gmz;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(15, 30));
        items.add(new Item(15, 45));
        items.add(new Item(15, 60));

        Collections.sort(items, new ComparateurCustomise());

    }
}
