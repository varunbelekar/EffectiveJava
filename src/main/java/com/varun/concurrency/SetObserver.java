package com.varun.concurrency;

@FunctionalInterface
public interface SetObserver<E> {
    void added(ObservableSet<E> set, E element);
}
