package oop;

/**
 * 封装：将数据和方法
 */
public class Package {
    double price;

    Package(int price) {
        this.price = price;
    }

    // 构造函数重载
    Package(double price) {
        // 在构造函数中调用另一个构造函数，只能在构造函数中的第一行使用一次
//        this(10);
        this.price = price;
    }

    public static void main(String[] args) {
        Package p1 = new Package(10);
        Package p2 = new Package(12.5);
    }
}
