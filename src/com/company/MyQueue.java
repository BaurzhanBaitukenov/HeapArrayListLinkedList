package com.company;
import java.util.*;

public class MyQueue<T>{
    public final MyArrayList<T> MyArrayList;

    public MyQueue()
    {
        MyArrayList = new MyArrayList<>();
    }

    public int size()
    {
        return MyArrayList.size();
    }

    public boolean isEmpty() {
        return (MyArrayList.size() == 0);
    }

    public T enqueue(T item)
    {
        MyArrayList.add(item);
        return item;
    }

    public T dequeue()
    {
        return MyArrayList.remove(0);
    }

    public T front()
    {
        return MyArrayList.get(0);
    }
}
