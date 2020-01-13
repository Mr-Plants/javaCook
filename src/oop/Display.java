package oop;

public class Display {
    private int value = 0;
    private int limit = 0;

    public void increase() {
        value++;
        if (value == limit) {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }

    Display(int limit) {
        this.limit = limit;
    }

    public static void main(String[] args) {
        Display c = new Display(24);
        for (int i = 0; i < 100; i++) {
            c.increase();
            System.out.println(c.getValue());
        }
    }
}
