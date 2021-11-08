package com.varun.innerclass;

public class TestOuter {
    static private int data = 10;
    static class StaticInner {
        void message(){
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        TestOuter.StaticInner obj = new StaticInner();
        obj.message();
    }
}
