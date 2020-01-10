package hello;

// java中主要有三种循环
public class Loop {
    //    todo 为什么main函数必须要传字符串类型的集合
    public static void main(String[] args) {
//   1. while循环
        boolean loop = true;
        int a = 0;
        int b = 0;
        while (a <= 3) {
            System.out.println(a);
            a++;
        }

        /*
         * 2.do...while
         * 和while唯一的区别是至少执行一次
         */
        do {
            System.out.println(b);
//            b++;
        } while (b > 0);

//        3. for循环

    }
}
