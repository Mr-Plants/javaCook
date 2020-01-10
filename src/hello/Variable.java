package hello;

// java变量一般有三类
public class Variable {
    //    类变量（静态变量）静态变量也可以只声明，不赋值，默认值规则同实例变量
    static int i = 0;

    private static double j;

    //    实例变量
    String name = "foo";

    //    实例变量具有默认值，数值型变量默认值是0，布尔值默认是false，引用类型默认值是null
    private int age;

    private String method() {
        //  局部变量，局部变量必须初始化才能使用，不然会报错
        int j = 0;
        return this.name;
    }

    public static void main(String[] args) {
        System.out.println(Variable.i);
        System.out.println(Variable.j);
        Variable v = new Variable();
        System.out.println(v.name);
        System.out.println(v.age);
        v.age = 33;
        v.name = "bar";
        System.out.println(v.method());
    }
}
