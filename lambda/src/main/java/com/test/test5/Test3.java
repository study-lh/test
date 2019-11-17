package com.test.test5;

import java.util.function.Consumer;

/**
 * Consumer
 */
public class Test3 {
    public static void main(String[] args) {
        Consumer<String> consumer=System.out::println;
        consumer.accept("abc");

    }
}
