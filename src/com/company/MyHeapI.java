package com.company;

public interface MyHeapI <T>{
    void add(T item);
    T removeRoot();
    boolean remove(T item);
    void heapify();
}
