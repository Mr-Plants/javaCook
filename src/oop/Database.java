package oop;

import java.util.ArrayList;

public class Database {
    private ArrayList<Item> items = new ArrayList<Item>();

    public void add(Item item) {
        items.add(item);
    }

    public void list() {
        for (Item item : items) {
            // 多态调用
            item.print();
        }
    }

    public static void main(String[] args) {
        CD cd1 = new CD("似是故人来", "梅艳芳", 520, "得不到的都是最好的");
        CD cd2 = new CD("牡丹亭外", "陈升", 521, "听歌的人最无情");
        CD cd3 = new CD("牡丹亭外", "陈升", 521, "听歌的人最无情");
        DVD dvd1 = new DVD("爱宠大机密", "Disney", 2, "双重人格小白兔");

//        cd1.print();
        // 双等号判断的是两个变量管理的是否是同一个对象
        System.out.println("cd2=cd3：" + (cd2 == cd3));
        /**
         * 如果要判断值是够相同，要使用equals()方法，继承于Object
         * 如果没有在CD类中重写
         */
        System.out.println(cd2.equals(cd3));
        Database db = new Database();

        /*
         * 向上造型（子类使用父类的类型，使用父类类型变量声明），不可以向下造型
         * 拿一个子类的类型当作父类的对象来用
         * 对于基本类型来说使用()圆括号表示类型转换，会改变后面的数据类型
         */
        int a = (int) 10.2;  // a=10
        db.add(cd1);
        db.add(cd2);
        db.add(dvd1);
        db.list();
    }
}
