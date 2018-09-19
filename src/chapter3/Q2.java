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

    public void insert(T e) {
        T[] arrayT = (T[]) new Comparable[len + 1];
        boolean finish = false;
        for (int i = 0; i < len; i++) {
            if (array[i].compareTo(e) < 0) {
                arrayT[i] = array[i];
            } else {
                arrayT[i] = e;
                for (int j = i; j < len; j++) {
                    arrayT[j + 1] = array[j];
                }
                finish = true;
                break;
            }
        }
        if (!finish) {
            arrayT = Arrays.copyOf(array, array.length + 1);
            arrayT[arrayT.length - 1] = e;
        }
        array = arrayT;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public Q2<T> merge(Q2<T> another) {
        T[] newArray = (T[]) new Comparable[len + another.len];
        for (int i = 0; i < len; i++) {
            newArray[i] = array[i];
        }
        for (int j = len; j < len + another.len; j++) {
            newArray[j] = another.array[j - len];
        }
        Arrays.sort(newArray);
        return new Q2<>(newArray);
    }

    public void deleteByRange(T s, T t) {
        if (s.compareTo(t) >= 0) {
            System.err.println("s must be less then t");
            System.exit(-1);
        }
        if (len == 0) {
            System.err.println("empty array");
            System.exit(-1);
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (s.compareTo(array[i]) < 0) {
                min = i;
                break;
            }
        }
        for (int i = len - 1; i > 0; i--) {
            if (array[i].compareTo(t) < 0) {
                max = i;
                break;
            }
        }
        System.out.println(min);
        System.out.println(max);
        for (int i = min; i <= max; i++) {
            System.out.println(i);
            array[i] = null;
        }
        System.out.println(Arrays.toString(array));
        formatting();
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

    @Override
    public String toString() {
        return "Q2{" +
                "array=" + (array == null ? null : Arrays.asList(array).subList(0, len)) +
                '}';
    }

    public static void main(String[] args) {
        Q2<Double> q2 = new Q2<>(new Double[]{8.0, 5.0, 2.0, 7.0, 4.0, 1.0});
        Q2<Double> q21 = new Q2<>(new Double[]{100.0, -80.0});
        q2.deleteByRange(9.0, 7.0);
        System.out.println(q2);
    }
}
