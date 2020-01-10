package hello;

// java有内置数据类型和引用数据类型

/**
 * 内置数据类型包括 八种 基本类型
 */
public class Type {
    int x = 0;
    long y = 0;
    boolean z = true;
    String n = "hello";

    public static void main(String[] args) {
// 比特
        System.out.println("byte 类型二进制位数：" + Byte.SIZE);
        System.out.println("byte 类型最大值：" + Byte.MAX_VALUE);
        System.out.println("byte 类型最小值：" + Byte.MIN_VALUE);
//整型
        System.out.println("int 类型二进制位数：" + Integer.SIZE);
        System.out.println("int 类型最大值：" + Integer.MAX_VALUE);
        System.out.println("int 类型最小值：" + Integer.MIN_VALUE);
//短整型
        System.out.println("short 类型二进制位数：" + Short.SIZE);
        System.out.println("short 类型最大值：" + Short.MAX_VALUE);
        System.out.println("short 类型最小值：" + Short.MIN_VALUE);
//长整型
        System.out.println("long 类型二进制位数：" + Long.SIZE);
        System.out.println("long 类型最大值：" + Long.MAX_VALUE);
        System.out.println("long 类型最小值：" + Long.MIN_VALUE);
//单精度浮点数
        System.out.println("float 类型二进制位数：" + Float.SIZE);
        System.out.println("float 类型最大值：" + Float.MAX_VALUE);
        System.out.println("float 类型最小值：" + Float.MIN_VALUE);
//双精度浮点数
        System.out.println("double 类型二进制位数：" + Double.SIZE);
        System.out.println("double 类型最大值：" + Double.MAX_VALUE);
        System.out.println("double 类型最小值：" + Double.MIN_VALUE);
//unicode字符
        System.out.println("char 类型二进制位数：" + Character.SIZE);
        System.out.println("char 类型最大值：" + (int) Character.MAX_VALUE);
        System.out.println("char 类型最小值：" + (int) Character.MIN_VALUE);
//此外还有布尔值
    }
}

