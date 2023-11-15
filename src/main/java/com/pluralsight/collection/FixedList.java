package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    List<T> items;
    int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        if(items.size() < maxSize) {
            items.add(item);
        } else {
            System.out.println("Sorry, can't add another item to the array. Maxsize is 3.");
        }
    }

    public List<T> getItems() {
        return this.items;
    }

}
