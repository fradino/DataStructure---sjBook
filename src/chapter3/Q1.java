package chapter3;

import java.util.*;

public class Q1<T extends Comparable<T>> {
    private T[] array;
    private int len;

    public Q1(T[] array) {
        this.array = (T[]) new Comparable[array.length];
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i];
        }
        this.len = array.length;
    }

    public T deleteMinimum() {
        int min = 0;
        for (int i = 1; i < len; i++) {
            if (array[i].compareTo(array[min]) < 0) {
                min = i;
            }
        }
        T ans = array[min];
        if (min != len - 1) {
            array[min] = array[len - 1];
            len--;
        } else {
            len--;
        }
        return ans;
    }

    private void formatting() {
        for (int i = 0; i < len; i++) {
            if (array[i] == null) {
                for (int j = i + 1; j < len; j++) {
                    array[j - 1] = array[j];
                }
                len--;
                i--;
            }
        }
    }

    public void deleteE(T e) {
        for (int i = 0; i < len; i++) {
            if (e.compareTo(array[i]) == 0) {
                array[i] = null;
            }
        }
        formatting();
    }

    @Override
    public String toString() {
        return "Q1{" +
                "array=" + (array == null ? null : Arrays.asList(array).subList(0, len)) +
                '}';
    }

    public void removeDuplicate() {
        Set<T> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if (set.contains(array[i])) {
                array[i] = null;
            }
            set.add(array[i]);
        }
        formatting();
    }

    public static void main(String[] args) {
        Q1<Integer> q1 = new Q1<>(new Integer[]{5, 1, 9, 7, 8, 3, 9});
        System.out.println(q1.deleteMinimum());
        System.out.println(q1);
        q1.deleteE(9);
        System.out.println(q1);
        q1 = new Q1<>(new Integer[]{1, 2, 3, 4, 5, 6, 5, 2, 5, 4, 1, 2, 3, 2, 7});
        System.out.println(q1);
        q1.removeDuplicate();
        System.out.println(q1);
    }


}
