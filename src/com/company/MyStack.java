package com.company;
import java.util.*;

public class MyStack<T>{
    public final MyLinkedList<T> MyLinkedlist;

    public MyStack()
    {
        MyLinkedlist = new MyLinkedList<>();
    }

    public int size()
    {
        return MyLinkedlist.size();
    }

    public boolean isEmpty() {
        return (MyLinkedlist.size() == 0);
    }

    public T push(T item)
    {
        MyLinkedlist.add(item);
        return item;
    }

    public T pop()
    {
        return MyLinkedlist.remove(0);
    }

    public T top()
    {
        return MyLinkedlist.get(0);
    }
}

