package castlegame;

public class Handler {
    protected CastleGame game;

    public void doCommand(String cmd) {
    }

    public boolean isBye() {
        return false;
    }

    public Handler(CastleGame game) {
        this.game = game;
    }
}
