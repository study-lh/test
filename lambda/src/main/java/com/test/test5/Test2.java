package com.test.test5;

import java.util.function.Function;

/**
 * Function
 */
public class Test2 {
    public static void main(String[] args) {
        Function<String,Boolean> s=s1->s1!=null;
        Boolean apply = s.apply("123");

        System.out.println(apply);

        Function<Boolean,Integer> s2=b->b?1:0;
        //方法相加，先运行上面的表达式，把结果作为第二个表达式的参数
    //    Function<String, Integer> andThen = s.andThen(s2);
        //将第一个的结果作为第二个的参数
        Function<String, Integer> compose = s2.compose(s);


        Integer apply1 = compose.apply("123");

        System.out.println(apply1);




    }
}
