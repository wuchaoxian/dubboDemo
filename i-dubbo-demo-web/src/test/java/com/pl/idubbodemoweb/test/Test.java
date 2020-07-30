package com.pl.idubbodemoweb.test;

public class Test {

    /**
     * print()方法编译报错
     * @param args
     */
    public static void main(String[] args) {
        int i = 0;
        for (print(i++), print(++i); i < 6 & print(++i) < 5; print(++i)) {
            print(0);
        }
    }
    public static int print(int a) {
        System.out.println(a);
        return a;
    }
}
