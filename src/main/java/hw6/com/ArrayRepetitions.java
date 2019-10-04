package hw6.com;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class ArrayRepetitions {
    List<Integer> list = new ArrayList<>();

    public void add () {
        list.add(4);
        list.add(5);
        list.add(-6);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
    }

    public void countRepetitions() {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(Integer value : list){
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        map.forEach((num, val) -> System.out.println(num + " - " + val));
    }

    public void init() {
        add();
        countRepetitions();
    }
}
