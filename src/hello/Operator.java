package hello;

public class Operator {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        System.out.println("a-b=" + (a - b));
        System.out.println("a+b=" + (a + b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b=" + (a / b));
        System.out.println("a%b=" + (a % b));
        System.out.println("a++" + (a++));
        System.out.println("++a" + (++a));
        System.out.println("a--" + (a--));
        System.out.println("--a" + (--a));

        System.out.println("a+=5" + (a += 5));
        System.out.println("a-=5" + (a -= 5));
        System.out.println("a*=5" + (a *= 5));
        System.out.println("a/=5" + (a /= 5));


        System.out.println("a==b " + (a == b));
        System.out.println("a!=b " + (a != b));
        System.out.println("a>b " + (a > b));
        System.out.println("a<b " + (a < b));
        System.out.println("a>=b " + (a >= b));
        System.out.println("a<=b " + (a <= b));


    }
}
