package world;

import hello.Modifier;

public class Modifier2 extends Modifier {
    public static void main(String[] args) {
        Modifier m = new Modifier();
//        此处测试不同包，非子类情况下变量访问情况，可以看到，只能访问public变量
        System.out.println(m.b);
        System.out.println(m.getA());
        m.setA(5);
        System.out.println(m.getA());
//  可以访问到不同包中继承的实例方法
        Modifier2.method();
//        不能访问不同包中继承的实例方法
//        m.method2();
        System.out.println(m instanceof Modifier);
    }

    /**
     * 父类中声明为public的方法在子类中也必须为public
     * 父类中声明为protected的方法在子类中只能为protected或者public
     * 父类中声明为private的方法不能被继承
     */

//    private static void method() {
//
//    }
    public static void method() {
        Modifier.method();
        System.out.println("子类重写method");
    }

}
