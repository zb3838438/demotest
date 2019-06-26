package com.zb.demotest;

import java.util.*;

public class voTest {
    voTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private LinkedHashMap<Integer, voTest> dealMap(HashMap<Integer, voTest> map) {
        if (map == null) return null;
        Collection<Map.Entry<Integer, voTest>> coll = map.entrySet();
        List<Map.Entry<Integer, voTest>> vv = new ArrayList<>(coll);

        Collections.sort(vv, (o1, o2) -> o2.getValue().getAge() - o1.getValue().getAge());
        LinkedHashMap<Integer, voTest> relMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, voTest> rel : vv) {
            relMap.put(rel.getKey(), rel.getValue());
        }
        return relMap;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 2, 2, 3, 44, 55, 44, 2, 55, 33, 88, 56, 77, 45, 1, 44, 4, 44, 55, 88};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        int b[] = new int[arr[arr.length-1]+1];
        for (int i = 0; i < arr.length; i++) {
            b[arr[i]]++;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0)
                System.out.println(i + " 共出现:" + b[i] + "次");
        }
        Map<Integer, Integer> mm = new HashMap<>();
        mm.put(1, 2);
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(9);
        set.add(3);
        set.add(5);
        set.add(78);
        set.add(989);
        set.add(23);
        System.out.println(set);
        voTest v1 = new voTest("z1", 1);
        voTest v2 = new voTest("z2", 12);
        voTest v3 = new voTest("z3", 8);
        voTest v4 = new voTest("z4", 10);
        HashMap<Integer, voTest> map = new HashMap<>();
        map.put(1, v1);
        map.put(2, v2);
        map.put(3, v3);
        map.put(4, v4);
        voTest deal = new voTest("en", 4);
        System.out.println(deal.dealMap(map));
        // map = deal.dealMap(map);
        for (Map.Entry<Integer, voTest> obj : map.entrySet()) {
            System.out.println(obj.getKey() + ":" + obj.getValue().getName() + "=" + obj.getValue().getAge());
        }

    }
}
