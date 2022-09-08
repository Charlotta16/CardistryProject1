package com.cardisty.catalog.placeholder;

import android.net.Uri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Content {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Map<String, Item> ITEM_MAP = new HashMap<String, Item>();

    public Content() {

    }

    private static void addItem(Item item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class Item {
        public final Uri uri;
        public final String id;
        public final String content;
        public final String details;

        public Item(String id, Uri uri, String content, String details) {
            this.uri = uri;
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}