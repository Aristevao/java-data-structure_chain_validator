package com.personetics.test;

public class Node<T> {

    private final T obj;

    public Node(final T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
