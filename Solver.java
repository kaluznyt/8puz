import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;

import java.util.LinkedList;

/**
 * Created by tkalu on 2017-04-16.
 */
public class Solver {
    private MinPQ<SearchNode> pq = new MinPQ<>();
    private SearchNode finalsn = null;

    public Solver(Board initial)           // find a solution to the initial board (using the A* algorithm)
    {
        int numberOfMoves = 1;

        SearchNode sn = new SearchNode(initial, null, numberOfMoves);

        pq.insert(sn);

        SearchNode minNode;

        while ((minNode = pq.delMin()) != null && !minNode.board.isGoal()) {
            numberOfMoves++;
            for (Board neighbor : minNode.board.neighbors()) {
                pq.insert(new SearchNode(neighbor, minNode, numberOfMoves));
            }

        }

        finalsn = minNode;
    }


    public boolean isSolvable()            // is the initial board solvable?
    {
        return finalsn != null;
    }

    public int moves()                     // min number of moves to solve initial board; -1 if unsolvable
    {
        return isSolvable() ? ((Stack) solution()).size() - 1 : -1;
    }

    public Iterable<Board> solution()      // sequence of boards in a shortest solution; null if unsolvable
    {
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

        public SearchNode(Board board, SearchNode prevBoard, int numberOfMoves) {
            this.board = board;
            this.prevBoard = prevBoard;
            this.numberOfMoves = numberOfMoves;
        }

        private int priority() {
            return this.board.manhattan() + this.numberOfMoves;
        }

        @Override
        public int compareTo(SearchNode o) {
            return this.priority() - o.priority();
        }
    }
}
