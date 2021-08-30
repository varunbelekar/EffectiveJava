package com.varun.concurrency;

import com.varun.classes.inheritance.ForwardingSet;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ObservableSet<E> extends ForwardingSet<E> {
    public ObservableSet(Set<E> set) {
        super(set);
    }
    //Use CopyOnWriteArrayList to avoid synchronization
    private final List<SetObserver<E>> observers = new CopyOnWriteArrayList<>();

    public void addObserver(SetObserver<E> observer) {
        /*synchronized(observers) {
            observers.add(observer);
        }*/
        observers.add(observer);
    }
    public boolean removeObserver(SetObserver<E> observer) {
        /*synchronized(observers) {
            return observers.remove(observer);
        }*/
        return observers.remove(observer);
    }
    private void notifyElementAdded(E element) {
       /* synchronized(observers) {
            for (SetObserver<E> observer : observers)
                observer.added(this, element);
        }*/
        for (SetObserver<E> observer : observers)
            observer.added(this, element);
    }

    @Override public boolean add(E element) {
        boolean added = super.add(element);
        if (added)
            notifyElementAdded(element);
        return added;
    }
    @Override public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for (E element : c)
            result |= add(element); // Calls notifyElementAdded
        return result;
    }

    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
        /*set.addObserver((observableSet, element) -> System.out.println(element));
         */

        set.addObserver(new SetObserver<>() {
            public void added(ObservableSet<Integer> s, Integer e) {
                System.out.println(e);
                if (e == 23)
                    s.removeObserver(this);
            }
        });

        for (int i = 0; i < 100; i++)
            set.add(i);
    }

}
