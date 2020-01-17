package castlegame;

public class HelpHandler extends Handler {

    // todo 能不能把这里改成自动获取所有可用的命令并展示出来
    @Override
    public void doCommand(String cmd) {
        System.out.println("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：go east");
    }

    public HelpHandler(CastleGame game) {
        super(game);
    }
}
