package org.lrwham.sorting;

import java.util.ArrayList;

public interface Sort<E extends Comparable<E>>{
    ArrayList<E> sort(ArrayList<E> unsorted);
    boolean isSorted(ArrayList<E> list);
}
// 