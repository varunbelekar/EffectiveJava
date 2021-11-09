package com.varun.annotations;


import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnotationDemo {
    public static void main(String[] args) {
        Nokia bees = new Nokia("Fire", 5);
        System.out.println(bees.getModel() + " " + bees.getScreenSize());

        Class c = bees.getClass();
        Annotation annotation = c.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println(smartPhone.osName() + " - " + smartPhone.version());
    }

    @Todo(author = "Varun", status = Todo.Status.NOT_STARTED, priority = Todo.Priority.LOW)
    public void sampleMethod(){
        System.out.println("Using custom annotations on method");
    }

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(i, new ArrayList<>());
        }
        for(int[] i : edges){

        }
        List<Integer> result = new ArrayList<>();

        return result;
    }
}



