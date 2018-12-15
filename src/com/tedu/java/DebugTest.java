package com.tedu.java;

import java.util.HashMap;

/**
 * @Author KnoSmi
 * @Date 2018/12/15 - 20:51
 */
public class DebugTest {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }


        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", "22");
        map.put("school", "FuDan");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("school");
        System.out.println(map);

    }
}
