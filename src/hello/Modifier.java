package hello;

// java主要有两类修饰符：访问修饰符和非访问修饰符
public class Modifier {
    //    不写，默认为default，在同一包内可见，可修饰：类、接口、变量、方法
    int a = 0;
    // 对所有类可见，可修饰：类、接口、变量、方法
    public int b = 0;
    //    对当前类可见，可修饰：方法、变量
    private int c = 0;
    // 对当前包及子类可见，可修饰：变量、方法
    protected int d = 0;

    /**
     * final用来修饰类、方法、变量
     * 修饰的类不能被继承
     * 修饰的方法不能被继承类重新定义（重写）
     * 修饰的变量为常量，不能再被修改
     */
    final int f = 1;

    // static用来修饰类的方法和属性，即静态方法和静态变量
    static int g = 0;

    /**
     * main方法必须设置成公有的，否则解释器不能运行该类
     *
     * @param args
     */
    public static void main(String[] args) {
//        静态方法不能访问使用类的非静态方法和变量
//        this.setA();
        Pool p = new Pool();
//        System.out.println(p.a);  //
    }

    //外部可以通过 getter和setter来访问及修改私有变量
    public int getA() {
        return this.a;
    }

    public void setA(int value) {
        this.a = value;
    }

    protected static void method() {
        System.out.println("可以访问到不同包中继承的静态方法");
    }

    protected void method2() {
        System.out.println("可以访问到不同包中继承的实例方法");
    }
}


class Pool extends Ac {
    private int a = 0;

    public void add() {

    }

    @Override
    public void getName() {

    }
}

// 抽象修饰符，可以修饰类、方法
abstract class Ac {
    public abstract void getName();
}

// synchronized 和 volatile 修饰符，主要用于线程的编程。