package castlegame;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<>();

    /**
     * 根据传入的方向返回对应的房间
     *
     * @param direction String
     * @return Room
     */
    public Room getExit(String direction) {
        return exits.get(direction);
    }

    /**
     * 设置某个方向的房间
     *
     * @param description
     * @param room
     */
    public void setExit(String description, Room room) {
        exits.put(description, room);
    }

    /**
     * 返回所有可行的方向
     *
     * @return
     */
    public String showDirs() {
        StringBuilder sb = new StringBuilder();
        for (String exit : exits.keySet()) {
            sb.append(exit + " ");
        }
        // todo 更好的将数组转换为string的方法
        return sb.toString();
    }

    @Override
    public String toString() {
        return description;
    }

    Room(String description) {
        this.description = description;
    }
}
