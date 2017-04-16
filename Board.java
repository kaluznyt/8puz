import edu.princeton.cs.algs4.Queue;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by tkalu on 2017-04-16.
 */
public class Board {
    private final int[][] tiles;
    private final int n;
    //private int[][] goal;
    private int tile0x;
    private int tile0y;

    public Board(int[][] blocks) {
        if (blocks == null || blocks.length == 0) {
            throw new IllegalArgumentException("blocks");
        }

        this.tiles = cloneArray(blocks);
        this.n = this.tiles.length;

        initializeGoalBoard(this.n);
    }

    private int[][] initializeGoalBoard(int n) {
       int[][] goal = new int[n][n];

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (tiles[y][x] == 0) {
                    tile0y = y;
                    tile0x = x;
                }
                goal[y][x] = y * n + x + 1;
            }
        }

        goal[n - 1][n - 1] = 0;

        return goal;
    }

    public int dimension() {
        return n;
    }

    public int hamming() {
        int counter = 0;
        int[][] goal = initializeGoalBoard(dimension());

        for (int i = 0; i < n; i++) {
            for (int x = 0; x < n; x++) {
                if (tiles[i][x] != 0 && goal[i][x] != tiles[i][x]) {
                    counter++;
                }
            }
        }

        return counter;
    }

    private int manhattanValue(int tile, int posx, int posy) {
        int[][] goal = initializeGoalBoard(dimension());
        int n = goal.length;

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (tile != 0 && tile == goal[y][x]) {
                    return Math.abs(posx - x) + Math.abs(posy - y);
                }
            }
        }

        return 0;
    }

    public int manhattan() {
        int[][] goal = initializeGoalBoard(dimension());
        int counter = 0;

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (tiles[y][x] != 0 && goal[y][x] != tiles[y][x]) {
                    counter += manhattanValue(tiles[y][x], x, y);
                }
            }
        }

        return counter;
    }

    public boolean isGoal() {
        return hamming() == 0;
    }

    public Board twin() {

        int[][] arr = cloneTiles();

        int block1 = 0, block2 = 0;
        int y1 = 0, y2 = 0, x1 = 0, x2 = 0;

        while ((block1 == 0 || block2 == 0)
                || block1 == block2) {

            y1 = ThreadLocalRandom.current().nextInt(0, n);
            x1 = ThreadLocalRandom.current().nextInt(0, n);

            y2 = ThreadLocalRandom.current().nextInt(0, n);
            x2 = ThreadLocalRandom.current().nextInt(0, n);

            block1 = arr[y1][x1];
            block2 = arr[y2][x2];
        }

        swap(arr, y1, x1, y2, x2);

        return new Board(arr);
    }

    public boolean equals(Object y) {
        Board board;
        if (!(y instanceof Board)) {
            return false;
        } else {
            board = (Board) y;
            if (board.dimension() != this.dimension()) {
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int x = 0; x < n; x++) {
                if (tiles[i][x] != board.tiles[i][x]) {
                    return false;
                }
            }
        }

        return true;
    }

    public Iterable<Board> neighbors() {
        Queue<Board> q = new Queue<>();

        // move left
        if (tile0x - 1 >= 0) {
            int[][] newTiles = cloneTiles();
            swap(newTiles, tile0x - 1, tile0y);
            Board b = new Board(newTiles);
            q.enqueue(b);
        }

        // move right
        if (tile0x + 1 < n) {
            int[][] newTiles = cloneTiles();
            swap(newTiles, tile0x + 1, tile0y);
            Board b = new Board(newTiles);
            q.enqueue(b);
        }

        // move up
        if (tile0y - 1 >= 0) {
            int[][] newTiles = cloneTiles();
            swap(newTiles, tile0x, tile0y - 1);
            Board b = new Board(newTiles);
            q.enqueue(b);
        }

        // move down
        if (tile0y + 1 < n) {
            int[][] newTiles = cloneTiles();
            swap(newTiles, tile0x, tile0y + 1);
            Board b = new Board(newTiles);
            q.enqueue(b);
        }

        return q;
    }

    private void swap(int[][] arr, int y1, int x1, int y2, int x2) {
        int tileVal = arr[y1][x1];

        arr[y1][x1] = arr[y2][x2];
        arr[y2][x2] = tileVal;
    }

    private void swap(int[][] arr, int x1, int y1) {
        int tileVal = arr[y1][x1];

        arr[y1][x1] = arr[tile0y][tile0x];
        arr[tile0y][tile0x] = tileVal;
    }

    private int[][] cloneTiles() {
        int length = tiles.length;
        int[][] target = new int[length][tiles[0].length];
        for (int i = 0; i < length; i++) {
            System.arraycopy(tiles[i], 0, target[i], 0, tiles[i].length);
        }
        return target;
    }

    private int[][] cloneArray(int[][] array) {
        int length = array.length;
        int[][] target = new int[length][array[0].length];
        for (int i = 0; i < length; i++) {
            System.arraycopy(array[i], 0, target[i], 0, array[i].length);
        }
        return target;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(n + "\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s.append(String.format("%2d ", tiles[i][j]));
            }
            s.append("\n");
        }
        return s.toString();
    }
}
