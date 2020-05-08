import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PONGpanel extends JPanel implements  ActionListener, KeyListener {
    private PONG game;
    private Ball ball;
    private Racket player1, player2;
    private int score1, score2;


    public PONGpanel (PONG game) {
    setBackground(Color.WHITE);
    this.game = game;
    ball = new Ball(game);
    player1 = new Racket(game, KeyEvent.VK_UP, KeyEvent.VK_DOWN, game.getWidth() - 36);
    player2 = new Racket(game, KeyEvent.VK_W, KeyEvent.VK_S, 20);
    Timer timer = new Timer(5, this);
    timer.start();
    addKeyListener(this);
    setFocusable(true);
    }

    public Racket getPlayer(int playerNo) {
        if (playerNo == 1)
        return player1;
      else
          return player2;
    }

    public void increaseScore(int playerNo) {
        if (playerNo == 1)
            score1++;
        else
            score2++;
    }

    public int getScore(int playerNo){
        if (playerNo == 1);
            return score1;
    }

    private void update() {
        ball.update();
        player1.update();
        player2.update();
    }

    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }

    public void keyPressed(KeyEvent e) {
            player1.pressed(e.getKeyCode());
            player2.pressed(e.getKeyCode());
        }
     public void keyReleased(KeyEvent e){
            player1.released(e.getKeyCode());
            player2.released(e.getKeyCode());
        }
        public void keyTyped(KeyEvent e) {
        ;
        }
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString(game.getPanel().getScore(1) + " : " + game.getPanel().getScore(2), game.getWidth() / 2, 10);
            ball.paint(g);
            player1.paint(g);
            player2.paint(g);
        }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent actionEvent) {

    }
}