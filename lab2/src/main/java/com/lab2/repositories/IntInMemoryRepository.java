package com.lab2.repositories;

import java.util.Random;

public interface IntInMemoryRepository {

    public void add(int element);
    public void remove(int position);
    public boolean contains(int element);
    public int getRandomElement(Random random);
    public int getSize();
}
