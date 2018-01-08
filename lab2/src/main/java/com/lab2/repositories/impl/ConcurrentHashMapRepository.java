package com.lab2.repositories.impl;

import com.lab2.repositories.InMemoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapRepository<T> implements InMemoryRepository<T> {
    private Map<Integer, T> map;

    public ConcurrentHashMapRepository() {
        this.map = new ConcurrentHashMap<>();
    }

    @Override
    public void add(T element) {
        map.put(element.hashCode(), element);
    }

    @Override
    public void remove(T element) {
        map.remove(element.hashCode());
    }

    @Override
    public boolean contains(T element) {
        return map.values().contains(element);
    }

    @Override
    public List<T> getAll() {
        return new ArrayList(map.values());
    }
}