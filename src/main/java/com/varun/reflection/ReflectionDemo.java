package com.varun.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ReflectionDemo {
    public static void main(String[] args) {
        Class<? extends Set<String>> c1 = null;
        try{
            c1 = (Class<? extends Set<String>>) Class.forName(args[0]);

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Constructor<? extends  Set<String>> constructor = null;
        try {
            constructor = c1.getConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        Set<String> s = null;
        try {
            s = constructor.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);

        Class<LinkedList> c2 = LinkedList.class;
        Constructor<LinkedList> linkedListConstructor = null;
        try {
            linkedListConstructor = c2.getConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        List<String> list = null;
        try {
            list = linkedListConstructor.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        list.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(list);
    }
}
