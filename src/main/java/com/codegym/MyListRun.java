package com.codegym;

public class MyListRun {
    public static void main(String[] args) {
        ListSimple<Integer> listSimple = new ListSimple<Integer>();
        listSimple.add(1);
        listSimple.add(2);
        listSimple.add(3);
        listSimple.add(4);
        listSimple.add(7);
        listSimple.add(123);

        System.out.println("element 1: "+listSimple.get(3));
        System.out.println("element 1: "+listSimple.get(2));
        System.out.println("element 1: "+listSimple.get(5));
        System.out.println("element 1: "+listSimple.get(4));


    }
}
