package org.kodluyoruz;

public interface Queue<T> {
    void add(T val);
    T peek();
    T poll();
}
