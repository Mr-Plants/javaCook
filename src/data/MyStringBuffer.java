package data;

public class MyStringBuffer {
    public static void main(String[] args) {
        /**
         * 因为string对象不能直接更改内容，所以对string做处理（例如使用加号拼接）实际是创建一个新对象的过程，性能不好
         * 所以一般操作string使用StringBuffer这个类
         */
        StringBuffer str = new StringBuffer();

        str.append("hello ");
        str.append("world ");
        str.append("!");
        System.out.println(str);
    }
}
