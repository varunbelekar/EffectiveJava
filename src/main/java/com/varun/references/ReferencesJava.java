package com.varun.references;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferencesJava {
    public static void main(String[] args) {
        Integer i = 5;// Strong reference
        SoftReference<Integer> softReference = new SoftReference<>(i); //Will be garbage collected only when JVM needs memory
        WeakReference<Integer> weakReference = new WeakReference<>(i); //Will be garbage collected eagerly
    }
}
