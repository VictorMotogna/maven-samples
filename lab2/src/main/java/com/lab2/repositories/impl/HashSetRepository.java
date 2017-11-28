package com.lab2.repositories.impl;

import com.lab2.repositories.InMemoryRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetRepository<T> implements InMemoryRepository<T> {
    private Set<T> arr;

    public HashSetRepository() {
        this.arr = new HashSet<>();
    }

    @Override
    public void add(T element) {
        arr.add(element);
    }

    @Override
    public void remove(T element) {
        arr.remove(element);
    }

    @Override
    public boolean contains(T element) {
        return (arr.contains(element));
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(arr);
    }
}
