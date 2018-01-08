package com.lab2.repositories.impl;

import com.lab2.repositories.IntInMemoryRepository;
import it.unimi.dsi.fastutil.ints.AbstractIntList;
import it.unimi.dsi.fastutil.ints.IntArrayList;

import java.util.Random;

public class FastUtilBasedRepository implements IntInMemoryRepository {

    private AbstractIntList list;

    public FastUtilBasedRepository() {
        this.list = new IntArrayList();
    }

    @Override
    public void add(int element) {
        list.add(element);
    }

    @Override
    public void remove(int element) {
        list.remove(element);
    }

    @Override
    public boolean contains(int element) {
        return list.contains(element);
    }

    @Override
    public int getRandomElement(Random random) {
        return list.get(random.nextInt(list.size()));
    }

    @Override
    public int getSize() {
        return list.size();
    }
}
