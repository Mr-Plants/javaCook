package hello;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("hello world!");
        System.out.println("请输入一个整数：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //  如果变量只声明但没有赋值，是不能使用的，会报错
        System.out.println("100-" + n + "=" + (100 - n));
    }
}
