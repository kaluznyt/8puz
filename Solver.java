import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by tkalu on 2017-04-16.
 */

public class Solver {
    private SearchNode finalsn = null;
    private boolean isSolvable = false;

    public Solver(Board initial)           // find a solution to the initial board (using the A* algorithm)
    {
        Board twin = initial.twin();

        MinPQ<SearchNode> pq = new MinPQ<>();
        MinPQ<SearchNode> pqTwin = new MinPQ<>();

        SearchNode minNode = new SearchNode(initial, null);
        SearchNode minNodeTwin = new SearchNode(twin, null);

        while (!minNode.board.isGoal() &
                !minNodeTwin.board.isGoal()) {
            {
                for (Board neighbor : minNode.board.neighbors()) {
                    if (!neighbor.equals(minNode.prevBoard != null ? minNode.prevBoard.board : null)) {
                        pq.insert(new SearchNode(neighbor, minNode));
                    }
                }
                for (Board neighbor : minNodeTwin.board.neighbors()) {
                    if (!neighbor.equals(minNodeTwin.prevBoard != null ? minNodeTwin.prevBoard.board : null)) {
                        pqTwin.insert(new SearchNode(neighbor, minNodeTwin));
                    }
                }

                minNode = pq.delMin();
                minNode.numberOfMoves++;

                minNodeTwin = pqTwin.delMin();
                minNodeTwin.numberOfMoves++;
            }
        }

        finalsn = minNode.board.isGoal() ? minNode : null;

        if (minNode.board.isGoal()) {
            isSolvable = true;
        }
    }

    public boolean isSolvable()            // is the initial board solvable?
    {
        return isSolvable;
    }

    public int moves()                     // min number of moves to solve initial board; -1 if unsolvable
    {
        return isSolvable() ? ((Stack) solution()).size() - 1 : -1;
    }

    public Iterable<Board> solution()      // sequence of boards in a shortest solution; null if unsolvable
    {
        if (!isSolvable()) return null;

        Stack<Board> boards = new Stack<>();
        SearchNode fsn = finalsn;
        boards.push(finalsn.board);

        while ((fsn = fsn.prevBoard) != null) {
            boards.push(fsn.board);
        }
        return boards;
    }

    private class SearchNode implements Comparable<SearchNode> {
        public SearchNode prevBoard;
        public Board board;
        int numberOfMoves = 0;

        public SearchNode(Board board, SearchNode prevBoard) {
            this.board = board;
            this.prevBoard = prevBoard;

            this.numberOfMoves += prevBoard != null ? prevBoard.numberOfMoves : 0;
        }

        private int priority() {
            return this.board.manhattan() + this.numberOfMoves;
        }

        @Override
        public int compareTo(SearchNode o) {
            return this.priority() - o.priority();
        }

        public void print() {
            StdOut.println("priority = " + priority());
            StdOut.println("moves = " + numberOfMoves);
            StdOut.println("manhattan = " + board.manhattan());

            StdOut.println(board.toString());
        }
    }
}
