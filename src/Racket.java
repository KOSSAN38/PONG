public class Racket {
    private static final int WIDTH = 10, HEIGHT = 60;
    private PONG game;
    private int up, down;
    private int x;
    private int y, ya;

    public Racket(PONG game, int up, int down, int x) {
        this.game = game;
        this.x = x;
        y = game.getHeight() / 2;
        this.up = up;
        this.down = down;
    }
    public void update() {
        if (y > 0 && y < game.getHeight() - HEIGHT - 29)
            y +=
    }
}
