package SnakeGame;
import java.util.*;

public class SnakeGameMyself {
    class Snake{
        int row;
        int col;
        char dir;
        public Snake(int row, int col, char dir){
            this.row = row;
            this.col = col;
            this.dir = dir;
        }
    }

    List<Snake> q;

    int height;
    int width;

    public SnakeGameMyself(int height, int width, int size){
        this.height = height;
        this.width = width;
        q = new ArrayList<>();
        int row = 0;
        for(int i = 0; i < size; i++){
            Snake newSnake = new Snake(row++, 0, 'D');
            q.add(newSnake);
        }
    }

    public boolean moveSnake(char dir){
        if(dir == 'D'){
            q.get(q.size() - 1).row  = (q.get(q.size() - 1).row + 1) % height;
            q.get(q.size() - 1).dir = dir;
            char prevDir = dir;

            for(int i = q.size() - 2; i >= 0; i--){
                Snake snake = q.get(i);
                if(snake.dir == 'U'){
                    snake.row = (snake.row - 1 < 0 ) ? height - 1 : snake.row - 1;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
                else if(snake.dir == 'D'){
                    snake.row = (snake.row + 1) % height;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
                else if(snake.dir == 'L'){
                    snake.col = (snake.col - 1) < 0 ? width - 1 : snake.col - 1;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
                else if(snake.dir == 'R'){
                    snake.col = (snake.col + 1) % width;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
            }
        }
        if(dir == 'U'){
            q.get(q.size() - 1).row  = (q.get(q.size() - 1).row - 1) < 0 ? q.get(q.size() - 1).row = height - 1 : q.get(q.size() - 1).row - 1;
            q.get(q.size() - 1).dir = dir;
            char prevDir = dir;

            for(int i = q.size() - 2; i >= 0; i--){
                Snake snake = q.get(i);
                if(snake.dir == 'U'){
                    snake.row = (snake.row - 1 < 0 ) ? height - 1 : snake.row - 1;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
                else if(snake.dir == 'D'){
                    snake.row = (snake.row + 1) % height;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
                else if(snake.dir == 'L'){
                    snake.col = (snake.col - 1) < 0 ? width - 1 : snake.col - 1;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
                else if(snake.dir == 'R'){
                    snake.col = (snake.col + 1) % width;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
            }
        }
        if(dir == 'L'){
            q.get(q.size() - 1).col  = (q.get(q.size() - 1).col - 1) < 0 ? width - 1 : q.get(q.size() - 1).col - 1;
            q.get(q.size() - 1).dir = dir;
            char prevDir = dir;

            for(int i = q.size() - 2; i >= 0; i--){
                Snake snake = q.get(i);
                if(snake.dir == 'U'){
                    snake.row = (snake.row - 1 < 0 ) ? height - 1 : snake.row - 1;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
                else if(snake.dir == 'D'){
                    snake.row = (snake.row + 1) % height;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
                else if(snake.dir == 'L'){
                    snake.col = (snake.col - 1) < 0 ? width - 1 : snake.col - 1;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
                else if(snake.dir == 'R'){
                    snake.col = (snake.col + 1) % width;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
            }
        }
        if(dir == 'R'){
            q.get(q.size() - 1).col  = (q.get(q.size() - 1).col + 1) % width;
            q.get(q.size() - 1).dir = dir;
            char prevDir = dir;

            for(int i = q.size() - 2; i >= 0; i--){
                Snake snake = q.get(i);
                if(snake.dir == 'U'){
                    snake.row = (snake.row - 1 < 0 ) ? height - 1 : snake.row - 1;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
                else if(snake.dir == 'D'){
                    snake.row = (snake.row + 1) % height;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                    continue;
                }
                else if(snake.dir == 'L'){
                    snake.col = (snake.col - 1) < 0 ? width - 1 : snake.col - 1;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
                else if(snake.dir == 'R'){
                    snake.col = (snake.col + 1) % width;
                    char nextDir = snake.dir;
                    snake.dir = prevDir;
                    prevDir = nextDir;
                }
            }
        }

        return true;
    }

    public void printBoard(){
        for(int i = 0; i < height; i ++){
            for(int j = 0; j < width; j++){
                int row = i;
                int col = j;
                if(contains(row, col)){
                    System.out.print("* ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean contains(int row, int col){
        for(Snake snake : q){
            if(snake.row == row && snake.col == col) {
                return true;
            }
        }

        return false;
    }

    public void printQ(){
        for(Snake snake : q){
            System.out.println(snake.row + " " + snake.col + " " + snake.dir);
        }
    }

    public static void main(String[] args) {
        SnakeGameMyself newSnakeGame = new SnakeGameMyself(4, 4, 3);
        Scanner sc = new Scanner(System.in);
        newSnakeGame.printBoard();

        while(true){
            System.out.println("U or D or L or R");
            char dir = sc.next().charAt(0);
            if(dir == 'q') break;

            newSnakeGame.moveSnake(dir);
            newSnakeGame.printBoard();
            newSnakeGame.printQ();

        }

        sc.close();
    }
}

/**
 *  0 * 0 0 0
 *  1 * 0 0 0
 *  2 * S 0 0
 *  3 0 0 0 0
 *
 */
