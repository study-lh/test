package com.test.test9;


public class test9 {

    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 3; i++) {
            inner:
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break inner;
                }
                System.out.println(i + "+" + j);
            }
        }
    }

}
