package com.lab2.repositories.impl;

import com.lab2.repositories.InMemoryRepository;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRepository<T> implements InMemoryRepository<T> {
    private List<T> arr;

    public ArrayListRepository() {
        this.arr = new ArrayList<>();
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
        return arr;
    }
}
