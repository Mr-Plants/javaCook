package notebook;

import java.util.ArrayList;
import java.util.HashSet;

public class NoteBook {
    // 范型（容器类）  容器类型<元素类型>
    private ArrayList<String> notes = new ArrayList<String>();

    public void add(String s) {
        notes.add(s);
    }

    public void add(String s, int location) {
        notes.add(location, s);
    }

    public int getSize() {
        return notes.size();
    }

    public String getNode(int index) {
        return notes.get(index);
    }

    public void remove(int index) {
        notes.remove(index);
    }

    public String[] list() {
        String[] a = new String[notes.size()];
        notes.toArray(a);
        System.out.println("notes：" + notes);
        return a;
    }

    // 所有的java类都可以重写toString方法更改输出
    public String toString() {
        return notes + "";
    }

    public static void main(String[] args) {
        NoteBook nb = new NoteBook();
        nb.add("first");
        nb.add("second");
        nb.add("second", 1);
        System.out.println(nb);
        System.out.println(nb.getSize());
        System.out.println(nb.getNode(0));
        nb.list();
//        System.out.println(notes);
        System.out.println("============================");
        // 集合（数学概念）不能用重复的元素，也不需要排序
        HashSet<String> a = new HashSet<String>();
        a.add("first");
        a.add("second");
        a.add("first");
//        for (String i : a) {
//            System.out.println(i);
//        }
        System.out.println(a);
    }
}
