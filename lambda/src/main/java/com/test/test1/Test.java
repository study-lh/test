package com.test.test1;

public class Test {
    public static void main(String[] args) {
        Ifunctional ifunctional = new IfunctionalImpl();
        ifunctional.defaultMethod();
        ifunctional.method();
        Ifunctional.staticMethod();
    }
}
