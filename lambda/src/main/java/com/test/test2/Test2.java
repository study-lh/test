package com.test.test2;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "c", "b", "z", "f", "e");
/*        Collections.sort(list,(String o1,String o2)->{
            return Collator.getInstance().compare(o1,o2);
        });*/


        // Collections.sort(list,(String o1,String o2)-> Collator.getInstance().compare(o1,o2));
        Collections.sort(list, (o1, o2) -> Collator.getInstance().compare(o1, o2));
       // list.stream().collect(Collectors.collectingAndThen(Collectors.toCollection()->))

        System.out.println(list);
    }
}
