package com.lab2.repositories;

import java.util.List;

public interface InMemoryRepository<T> {

    void add(T element);
    void remove(T element);
    boolean contains(T element);
    List<T> getAll();
}
