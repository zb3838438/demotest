package com.zb.demotest;

import java.util.ArrayList;
import java.util.List;
//import java.util.Arrays;


public class CollectionsTest {
    List binarySearch() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-1);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(9);
        list.add(5);
        list.add(11);
        return list;
    }

    public static void main(String[] aa) {
        String a="nihao";
        String b="ni";
        String c="hao";
        String d =b+c;
        String e="ni"+"hao";
        System.out.println(e==d);
    }

    public void testThrow() {
        Object obj = null;
    }
}
