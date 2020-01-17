package castlegame;

public class GoHandler extends Handler {

    @Override
    public void doCommand(String cmd) {
        // todo 寻找更好的方法，能够访问game类的方法，而不是通过构造函数传入
        game.goRoom(cmd);
    }

    public GoHandler(CastleGame game) {
        super(game);
    }
}
