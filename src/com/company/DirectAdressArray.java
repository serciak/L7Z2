package com.company;

import java.util.Arrays;

public class DirectAdressArray<T> {

    private int size;
    private T[] array;

    public DirectAdressArray(int size) {
        this.size = size;
        array =  (T[]) new Object[size];
    }

    public String toString() {
        return Arrays.toString(array);
    }

    private void expand(int newSize) {
        T[] temp = (T[]) new Object[newSize+1];

        for(int i = 0; i < array.length; i++)
            temp[i] = array[i];

        array = temp;
        size = newSize+1;
    }

    public void add(int key, T elem) {
        if(key >= size)
            expand(key);
        array[key] = elem;
    }

    public T get(int key) {
        if(key >= size && key < 0)
            throw new IndexOutOfBoundsException();

        return array[key];
    }

    public T remove(int key) {
        if(key >= size && key < 0)
            throw new IndexOutOfBoundsException();

        T res = array[key];
        array[key] = null;
        return res;
    }

    public boolean contains(int key) {
        if(key >= size && key < 0)
            return false;
        if(array[key] != null)
            return true;
        return false;
    }
}
