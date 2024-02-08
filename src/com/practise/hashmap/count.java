package com.practise.hashmap;

import java.util.HashMap;

public class count {

    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("apple",1);
        map.put("orange",1);
        map.put("mango",1);
        

        for (String i : map.keySet()) {
            System.out.println(  i + " " + map.get(i));
        }
    }
}
