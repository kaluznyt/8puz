import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Queue;

/**
 * Created by tkalu on 2017-04-16.
 */
public class Solver {
    private MinPQ<SearchNode> pq = new MinPQ<>();
    private int numberOfMoves = 0;
    private SearchNode finalsn = null;

    public Solver(Board initial)           // find a solution to the initial board (using the A* algorithm)
    {
        numberOfMoves = 0;

        SearchNode sn = new SearchNode(initial, null, numberOfMoves);

        pq.insert(sn);

        SearchNode minNode = pq.delMin();

        while (!minNode.board.isGoal()) {
            for (Board neighbor : minNode.board.neighbors()) {
                pq.insert(new SearchNode(neighbor, minNode.board, numberOfMoves ));
            }

            minNode = pq.delMin();
            numberOfMoves++;
        }

        finalsn = minNode;
    }


    public boolean isSolvable()            // is the initial board solvable?
    {
        return finalsn != null;
    }

    public int moves()                     // min number of moves to solve initial board; -1 if unsolvable
    {
        return this.numberOfMoves;
    }

    public Iterable<Board> solution()      // sequence of boards in a shortest solution; null if unsolvable
    {
        Queue<Board> boards = new Queue<>();
        boards.enqueue(finalsn.board);

        while (finalsn.prevBoard != null) {
            boards.enqueue(finalsn.prevBoard);
        }
        return boards;
    }

    private class SearchNode implements Comparable<SearchNode> {
        public Board prevBoard;
        public Board board;
        int numberOfMoves;

        public SearchNode(Board board, Board prevBoard, int numberOfMoves) {
            this.board = board;
            this.prevBoard = prevBoard;
            this.numberOfMoves = numberOfMoves;
        }


        @Override
        public int compareTo(SearchNode o) {
            return this.board.manhattan() - o.board.manhattan();
        }
    }
}
