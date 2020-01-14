package hello;

import java.util.Date;

public class Mydate {
    private String name;

    Mydate(String name) {
        this.name = name;
    }

    public void gogo(Mydate d) {
        System.out.println(d.name);
    }

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());
        // 私有限制的是类不是对象（语法层面）
        Mydate i = new Mydate("foo");
        Mydate j = new Mydate("bar");
        i.gogo(j);
    }
}
