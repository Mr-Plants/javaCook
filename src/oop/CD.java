package oop;


import java.util.Objects;

public class CD extends Item {
    private String artist;

    public CD(String title, String artist, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        this.artist = artist;
    }

    // 子类的方法覆盖（重写）父类的方法
    @Override
    public void print() {
        super.print();
        System.out.println(artist);
    }

    /**
     * 重写equals方法，修改判断规则
     * 重写不能改变函数签名、入参、返回值、修饰符
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        // 直接使用Object类型无法获取artist属性，需要向下造型将Object造型成CD
        CD cd = (CD) o;
//        return Objects.equals(artist, cd.artist);
        return artist.equals(cd.artist);
    }

    public static void main(String[] args) {

    }
}
