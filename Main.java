import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class Main {

    public static String toString(int[][] tiles) {
        StringBuilder s = new StringBuilder();
        int n = tiles.length;
        s.append(n + "\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s.append(String.format("%2d ", tiles[i][j]));
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        args = new String[1];
        //args[0] = "C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-00.txt";
        args[0] = "C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle2x2-unsolvable1.txt";
        // write your code here
        // create initial board from file
        In in = new In(args[0]);

        int n = in.readInt();
        int[][] blocks = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                blocks[i][j] = in.readInt();

        Board initial = new Board(blocks);
        StdOut.print("Initial:");
        StdOut.print(initial.toString());

        Board twin1 = initial.twin();
        StdOut.print("Twin:");
        StdOut.print(twin1.toString());

        Queue<Board> neighbors = (Queue<Board>) initial.neighbors();

//        for (Board b:neighbors) {
//            StdOut.print(b.toString());
//        }

      //  StdOut.print(toString(Board.goal));

        // solve the puzzle
        Solver solver = new Solver(initial);

        // print solution to standard output
        if (!solver.isSolvable())
            StdOut.println("No solution possible");
        else {
            StdOut.println("Minimum number of moves = " + solver.moves());
            for (Board board : solver.solution())
                StdOut.println(board);
        }
    }
}
