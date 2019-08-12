package com.zah.LRU;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lru<K, V> extends LinkedHashMap<K, V> {
    public static void main(String[] args) {
        Lru<String,String> stringLru =new Lru<>(4);
        stringLru.put("1","1");
        stringLru.put("2","2");
        stringLru.put("3","3");
        stringLru.put("4","4");
        stringLru.get("1");
        stringLru.put("5","5");
        stringLru.put("6","6");
        System.out.println(stringLru.toString());
    }
    private final int size;

    public Lru(int size) {
        super((int) Math.ceil(size / 0.75) + 1, 0.75f, true);
        this.size = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K, V> entry : entrySet()) {
            sb.append(String.format("%s:%s ", entry.getKey(), entry.getValue()));
        }
        return sb.toString();
    }
}
