package com.joyful;

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;

import java.util.ArrayList;
import java.util.List;

public class FilterApple {
    public static List<Apple> findGreenApple(List<Apple> apples){
        List<Apple> list =new ArrayList<>();
        for (Apple apple:apples){
            if ("green".equals(apple.getColor())){
                list.add(apple);
            }
        }
        return list;
    }

    public static  List<Apple> findApple(List<Apple> apples,String color){
        List<Apple> list =new ArrayList<>();
        for (Apple apple:apples){
            if (color.equals(apple.getColor())){
                list.add(apple);
            }
        }
        return list;
    }
}
