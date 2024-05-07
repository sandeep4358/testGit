package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        getReverse("Today is java interview");

    }

    static void getReverse(String str) {
        String[] arr = str.split(" ");
        String s1 = Arrays.asList(arr).stream().map(s -> new StringBuffer(s).reverse()).collect(Collectors.joining(" "));

        System.out.println(s1);

    }

//    public static String reverse(String string) {
//        return Stream.of(string)
//                .map(word->new StringBuilder(word).reverse())
//                .collect(Collectors.joining(" "));
//    }

    public static void countWords(String str){
        int count = 0;

        System.out.println(Stream.of(str).map(s -> s.toCharArray().length).findFirst().get());

    }

    //Write a Program to find the duplicates in an array using stream API.
    static void dublicate(){
        int [] ar = {1,2,3,5,1,2,3,4,6,5};

        List<Integer> intList = Arrays.stream(ar).boxed().collect(Collectors.toList());

        intList.stream().filter(i-> Collections.frequency(intList,i) >1).distinct().forEach(System.out::println);

    }


static void testConflictRemote(){
    System.out.println("main branch changes are added");
}

}
