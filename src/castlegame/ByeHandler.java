package castlegame;

public class ByeHandler extends Handler {
    @Override
    public void doCommand(String cmd) {
        System.out.println("感谢您的光临，再见！");
    }

    @Override
    public boolean isBye() {
        return true;
    }
}
