import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        int bordWidth = 600;
        int bordHeight = bordWidth;

        JFrame frame = new JFrame("snake");
        frame.setVisible(true);
        frame.setSize(bordWidth, bordHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(bordWidth, bordHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}
