package com.zhangph.test;

public class Test1 {
    public static void main(String[] args)  throws Exception {
        Integer a = 200;
        Integer b = 200;
        int a1=200;
        int b1=200;
        System.out.println(a==b);
        System.out.println(a==200);
        System.out.println(b==200);
        System.out.println(a1==b1);
        System.out.println(a1==200);
        System.out.println(a.equals(b));
    }
}
