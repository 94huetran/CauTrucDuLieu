package com.codegym;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ListSimple<E> {
    int size = 0;
    int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public ListSimple() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapal() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapal();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: "+i+"size: "+i);
        }
        return (E) elements[i];

    }
}
