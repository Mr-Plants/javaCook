package oop;

/**
 * 抽象类和抽象方法
 */
public class Abstract extends Basic {
    private String name = "233";

    // 内部类，作为外部类的成员，可以访问外部类的属性和方法
    class Abc {

    }

//    new一个对象的时候给出类的定义就形成了匿名类，属于内部类

    /**
     * 分两类：类内部，函数内部
     * 当在函数内部时，可以访问函数里final的变量
     * 匿名类可以继承，也可以实现某接口
     */

    @Override
    public void run() {
//        子类必须实现抽象类的方法，否则自己就成了抽象类
    }

    public static void main(String[] args) {
        // 抽象类不能实例化对象，但是可以定义变量，变量必须要指向抽象类的子类实例对象
        Basic b = new Abstract();

    }
}

/**
 * 计算机学科中存在两种抽象，对细节的抽象和对具体的抽象
 * 抽象类就是对具体的抽象
 * 对细节的抽象是指在一定程度上忽略细节
 */

abstract class Basic {
    public abstract void run();
}