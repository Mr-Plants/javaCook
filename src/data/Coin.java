package data;

import java.util.HashMap;

// 先设计接口，再考虑具体实现
public class Coin {
    //    hash里面放的数据必须是对象类型，不能是简单类型
    private HashMap<Integer, String> coinNames = new HashMap<>();

    public Coin() {
        coinNames.put(1, "penny");
        coinNames.put(10, "dime");
        coinNames.put(25, "quarter");
        coinNames.put(50, "half-dollar");
        coinNames.put(50, "五毛");
        System.out.println(coinNames);
        System.out.println(coinNames.keySet());
        System.out.println(coinNames.keySet().size());
        for (Integer key : coinNames.keySet()) {
            System.out.println(coinNames.get(key));
        }
    }

    public String getName(int key) {
        // 高级用法
//        return coinNames.getOrDefault(key, "NOT FOUND!");

        if (coinNames.containsKey(key)) {
            return coinNames.get(key);
        } else {
            return "NOT FOUND!";
        }

    }

    public static void main(String[] args) {
        Coin c = new Coin();
        System.out.println(c.getName(25));  // quarter
        System.out.println(c.getName(24));   // null
    }
}
