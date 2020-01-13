package hello;

/**
 * 内置数据类型与包装类
 * 当内置数据类型被当作对象使用时，编译器会把内置类型装箱为包装类
 * 当需要用到基础类型时，编译器会把一个对象拆箱为内置类型
 * Float,Double,Short,Long,Byte,Integer这些包装类都是抽象类Number的子类
 */
public class Wrapper {


    public static void main(String[] args) {
        Integer a = 0;
        String b = "hello";
        //  Character需要使用单引号，表示单个字符，支持Unicode表示
        Character c = 'h';
        Character d = '\u039A';
        int[] e = {1, 2, 3};

        //  通过包装类的实例去掉用对象的方法
        System.out.println(a.toString());
        System.out.println(a.equals(0));
        // 两种对象获取length方法不一样
        System.out.println(b.length());
        System.out.println(e.length);
        // Math的所以对外暴露的属性和方法都定义为static形式
        System.out.println(Math.PI);
        System.out.println(a instanceof Number);
    }
}
