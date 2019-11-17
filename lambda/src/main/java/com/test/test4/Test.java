package com.test.test4;


import com.demo.lambda.test3.Ifuncationle;

public class Test {
    public static void main(String[] args) {
         String tag = "abc";//被lambda表达式所访问过的变量不可被后面的代码所修改
        Ifuncationle<String, Boolean> fun = s -> s.equals(tag);
        Boolean a = fun.handle("a");
        System.out.println(a);
      //  tag="bbb";
    }
}
