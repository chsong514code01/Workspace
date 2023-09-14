package com.joyful;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Apple> list= Arrays.asList(new Apple("green",150l),new Apple("yellow",120l),new Apple("green",170l));
        List<Apple> greenApple=FilterApple.findGreenApple(list);
        assert greenApple.size()==3:"throw exception";

    }
}
