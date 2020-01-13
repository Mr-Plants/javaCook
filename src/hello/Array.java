package hello;

/**
 * Java 语言中提供的数组是用来存储固定大小的同类型元素。
 */
public class Array {
    public static void main(String[] args) {
        // 数组声明，必须指定数组的大小
        Integer[] array = new Integer[10];
        array[9] = 23;
        // 也支持字面量形式创建，访问使用索引
        String[] arr2 = {"h", "e", "l", "l", "o"};
        // 数组初始化，声明加赋值
        int[] arr3 = new int[]{1, 2, 3, 4, 5};
        // 二维数组
        int arr4[][] = new int[2][3];
        int arr5[][] = new int[][]{{1, 2, 3}, {2, 3, 4}};

        System.out.println(array.length);

        // 两种遍历方式
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        // 字符串是不能用foreach的，只有可枚举数据可以
        for (Integer item : array) {
            System.out.println(item);
        }

    }
}
