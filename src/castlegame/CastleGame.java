package castlegame;

import java.util.HashMap;
import java.util.Scanner;

public class CastleGame {
    private Room currentRoom;
    private HashMap<String, Handler> handlers = new HashMap<>();

    CastleGame() {
        showWelcome();
        createRooms();
        creatHandler();
    }

    private void showWelcome() {
        StringBuilder welcome = new StringBuilder();
        welcome.append("================================\n");
        welcome.append("*欢迎来到魔堡！*\n");
        welcome.append("*这是一个超级无聊的游戏。*\n");
        welcome.append("*如果需要帮助，请输入 'help'*\n");
        welcome.append("*Enjoy!*\n");
        welcome.append("================================\n");
        System.out.println(welcome);
    }

    private void createRooms() {
        // todo 考虑使用数据维护，自动化载入
        Room castle = new Room("城堡外");
        Room lobby = new Room("大堂");
        Room pub = new Room("小酒吧");
        Room study = new Room("书房");
        Room bedroom = new Room("卧室");
        Room horse = new Room("马厩");

        castle.setExit("south", lobby);
        castle.setExit("east", horse);
        lobby.setExit("east", pub);
        lobby.setExit("north", bedroom);
        lobby.setExit("south", castle);
        pub.setExit("north", study);
        pub.setExit("west", lobby);
        pub.setExit("south", horse);
        study.setExit("west", bedroom);
        study.setExit("south", pub);
        bedroom.setExit("south", lobby);
        bedroom.setExit("east", study);
        horse.setExit("west", castle);
        horse.setExit("north", pub);

        // 初始在城堡外
        currentRoom = castle;
        showPrompt(castle);
    }

    private void creatHandler() {
        handlers.put("go", new GoHandler());
        handlers.put("bye", new ByeHandler());
        handlers.put("help", new HelpHandler());
    }

    private void goRoom(String direction) {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom != null) {
            currentRoom = nextRoom;
            showPrompt(nextRoom);
        } else {
            System.out.println("那里没有门");
        }

    }

    private void showPrompt(Room room) {
        System.out.println("你现在在" + room);
        System.out.println("出口有：" + room.showDirs());
    }

    private void play() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String in = sc.nextLine();
            String[] cmds = in.split(" ");
            Handler hd = handlers.get(cmds[0]);
            String str = cmds.length > 1 ? cmds[1] : "";
            if (hd != null) {
                hd.doCommand(str);
                if (hd.isBye()) {
                    sc.close();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        CastleGame game = new CastleGame();
        game.play();
    }
}
