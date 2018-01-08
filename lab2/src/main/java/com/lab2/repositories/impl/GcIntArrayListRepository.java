package com.lab2.repositories.impl;

import com.lab2.repositories.IntInMemoryRepository;
import org.eclipse.collections.impl.list.mutable.primitive.IntArrayList;

import java.util.Random;

public class GcIntArrayListRepository implements IntInMemoryRepository {
    private IntArrayList ls = new IntArrayList();

    public GcIntArrayListRepository() {
        ls = new IntArrayList();
    }

    @Override
    public void add(int element) {
        ls.add(element);
    }

    @Override
    public void remove(int element) {
        ls.remove(element);
    }

    @Override
    public boolean contains(int element) {
        return ls.contains(element);
    }

    @Override
    public int getRandomElement(Random random) {
        return ls.get(random.nextInt(ls.size()));
    }

    @Override
    public int getSize() {
        return ls.size();
    }
}
