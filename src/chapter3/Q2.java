package chapter3;

import java.util.Arrays;

public class Q2<T extends Comparable> {
    private T[] array;
    private int len;

    public Q2(T[] array) {
        this.array = Arrays.copyOf(array, array.length);
        Arrays.sort(this.array);
        len = array.length;
    }

    public void insert() {
        T[] arrayT = (T[]) new Object[len + 1];

    }
}
