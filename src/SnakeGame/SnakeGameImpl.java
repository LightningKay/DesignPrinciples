package SnakeGame;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class SnakeGameImpl implements SnakeGame{
    private int height;
    private int width;
    private int steps;
    private int growthFactor;
    private int initialSize;
    private Deque<Integer> queue;
    private int currentDir;
    private boolean gameOver;

    public SnakeGameImpl(int height, int width, int growthFactor, int initialSize) {
        this.height = height;
        this.width = width;
        this.steps = 0;
        this.growthFactor = growthFactor;
        this.initialSize = initialSize;
        this.queue = new ArrayDeque<>();
        this.currentDir = 0;
        this.gameOver = false;

        for (int i = 0; i < initialSize; i++) {
            queue.addLast(i * width);
        }
    }

    @Override
    public boolean moveSnake(char direction) {
        if (gameOver) {
            System.out.println("Game is already over!");
            return false;
        }

        int newDirection = currentDir;

        switch (direction) {
            case 'u':
                newDirection = 0;
                break;
            case 'd':
                newDirection = 2;
                break;
            case 'r':
                newDirection = 1;
                break;
            case 'l':
                newDirection = 3;
                break;
        }

        if ((currentDir == 0 && newDirection == 2)
                || (currentDir == 2 && newDirection == 0)
                || (currentDir == 1 && newDirection == 3)
                || (currentDir == 3 && newDirection == 1)) {
            System.out.println("Cannot immediately move to opposite direction. It stays where it is.");
            return true;
        }

        int head = queue.peekFirst();
        int row = head / width;
        int col = head % width;

        switch (direction) {
            case 'u':
                row--;
                break;
            case 'd':
                row++;
                break;
            case 'l':
                col--;
                break;
            case 'r':
                col++;
                break;
        }

        row = (row + height) % height;
        col = (col + width) % width;

        int currHead = getCurrHead(row, col, width);
        if (queue.contains(currHead)) {
            System.out.println("Game Over. Snake has hit itself.");
            gameOver = true;
            return false;
        }

        queue.addFirst(currHead);
        steps++;
        System.out.println("Steps: " + steps);

        if (steps % growthFactor != 0) {
            queue.pollLast();
        }

        currentDir = newDirection;
        return true;
    }

    @Override
    public boolean isGameOver() {
        return gameOver;
    }

    @Override
    public void printGame() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int position = getCurrHead(i, j, width);
                if (queue.contains(position)) {
                    System.out.print("S ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private int getCurrHead(int x, int y, int width) {
        return x * width + y;
    }

    public static void main(String[] args) {
        SnakeGameImpl game = new SnakeGameImpl(10, 10, 5, 3);
        Scanner sc = new Scanner(System.in);
        game.printGame();

        while (true) {
            System.out.println("Choose direction (u: up, d: down, l: left, r: right) or 'q' to quit:");
            char move = sc.next().charAt(0);

            if (move == 'q') {
                System.out.println("Game Quit.");
                break;
            }

            if (move != 'u' && move != 'd' && move != 'l' && move != 'r') {
                System.out.println("Invalid input! Use u/d/l/r.");
                continue;
            }

            game.moveSnake(move);
            game.printGame();

            if (game.isGameOver()) {
                System.out.println("Game Over! Snake died.");
                break;
            }
        }

        sc.close();
}
}
