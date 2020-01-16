package oop;

/**
 * 多态类型
 * 声明类型是Item
 * 动态类型可以是CD或者是DVD
 * 当调用实例的方法时，会根据动态类型去动态的调用相应的方法（动态绑定）
 */
public class Item {
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public Item(String title, int playingTime, boolean gotIt, String comment) {
        this.title = title;
        this.playingTime = playingTime;
        this.gotIt = gotIt;
        this.comment = comment;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", playingTime=" + playingTime +
                ", gotIt=" + gotIt +
                ", comment='" + comment + '\'' +
                '}';
    }
}
