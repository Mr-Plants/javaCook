package oop;

/**
 * java 单根结构：所有的类默认继承于Object
 * toString()
 * equals()
 */
public class Root {
    public static void main(String[] args) {
        Object o = new Object();
//        o
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
