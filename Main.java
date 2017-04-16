import edu.princeton.cs.algs4.In;
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
//        args = new String[150];

//        args[0]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle00.txt";
//        args[1]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle01.txt";
//        args[2]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle02.txt";
//        args[3]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle03.txt";
//        args[4]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle04.txt";
//        args[5]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle05.txt";
//        args[6]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle06.txt";
//        args[7]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle07.txt";
//        args[8]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle08.txt";
//        args[9]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle09.txt";
//        args[10]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle10.txt";
//        args[11]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle11.txt";
//        args[12]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle12.txt";
//        args[13]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle13.txt";
//        args[14]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle14.txt";
//        args[15]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle15.txt";
//        args[16]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle16.txt";
//        args[17]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle17.txt";
//        args[18]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle18.txt";
//        args[19]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle19.txt";
//        args[20]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle20.txt";
//        args[21]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle21.txt";
//        args[22]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle22.txt";
//        args[23]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle23.txt";
//        args[24]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle24.txt";
//        args[25]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle25.txt";
//        args[26]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle26.txt";
//        args[27]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle27.txt";
//        args[28]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle28.txt";
//        args[29]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle29.txt";
//        args[30]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle2x2-00.txt";
//        args[31]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle2x2-01.txt";
//        args[32]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle2x2-02.txt";
//        args[33]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle2x2-03.txt";
//        args[34]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle2x2-04.txt";
//        args[35]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle2x2-05.txt";
//        args[36]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle2x2-06.txt";
//        args[37]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle2x2-unsolvable1.txt";
//        args[38]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle2x2-unsolvable2.txt";
//        args[39]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle2x2-unsolvable3.txt";
//        args[40]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle30.txt";
//        args[41]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle31.txt";
//        args[42]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle32.txt";
//        args[43]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle33.txt";
//        args[44]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle34.txt";
//        args[45]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle35.txt";
//        args[46]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle36.txt";
//        args[47]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle37.txt";
//        args[48]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle38.txt";
//        args[49]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle39.txt";
//        args[50]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-00.txt";
//        args[51]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-01.txt";
//        args[52]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-02.txt";
//        args[53]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-03.txt";
//        args[54]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-04.txt";
//        args[55]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-05.txt";
//        args[56]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-06.txt";
//        args[57]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-07.txt";
//        args[58]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-08.txt";
//        args[59]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-09.txt";
//        args[60]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-10.txt";
//        args[61]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-11.txt";
//        args[62]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-12.txt";
//        args[63]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-13.txt";
//        args[64]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-14.txt";
//        args[65]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-15.txt";
//        args[66]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-16.txt";
//        args[67]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-17.txt";
//        args[68]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-18.txt";
//        args[69]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-19.txt";
//        args[70]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-20.txt";
//        args[71]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-21.txt";
//        args[72]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-22.txt";
//        args[73]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-23.txt";
//        args[74]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-24.txt";
//        args[75]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-25.txt";
//        args[76]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-26.txt";
//        args[77]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-27.txt";
//        args[78]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-28.txt";
//        args[79]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-29.txt";
//        args[80]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-30.txt";
//        args[81]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-31.txt";
//        args[82]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-unsolvable.txt";
//        args[83]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-unsolvable1.txt";
//        args[84]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-unsolvable2.txt";
//        args[85]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle40.txt";
//        args[86]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle41.txt";
//        args[87]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle42.txt";
//        args[88]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle43.txt";
//        args[89]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle44.txt";
//        args[90]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle45.txt";
//        args[91]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle46.txt";
//        args[92]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle47.txt";
//        args[93]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle48.txt";
//        args[94]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle49.txt";
//        args[95]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-00.txt";
//        args[96]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-01.txt";
//        args[97]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-02.txt";
//        args[98]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-03.txt";
//        args[99]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-04.txt";
//        args[100]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-05.txt";
//        args[101]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-06.txt";
//        args[102]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-07.txt";
//        args[103]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-08.txt";
//        args[104]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-09.txt";
//        args[105]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-10.txt";
//        args[106]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-11.txt";
//        args[107]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-12.txt";
//        args[108]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-13.txt";
//        args[109]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-14.txt";
//        args[110]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-15.txt";
//        args[111]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-16.txt";
//        args[112]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-17.txt";
//        args[113]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-18.txt";
//        args[114]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-19.txt";
//        args[115]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-20.txt";
//        args[116]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-21.txt";
//        args[117]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-22.txt";
//        args[118]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-23.txt";
//        args[119]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-24.txt";
//        args[120]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-25.txt";
//        args[121]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-26.txt";
//        args[122]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-27.txt";
//        args[123]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-28.txt";
//        args[124]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-29.txt";
//        args[125]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-30.txt";
//        args[126]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-31.txt";
//        args[127]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-32.txt";
//        args[128]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-33.txt";
//        args[129]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-34.txt";
//        args[130]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-35.txt";
//        args[131]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-36.txt";
//        args[132]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-37.txt";
//        args[133]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-38.txt";
//        args[134]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-39.txt";
//        args[135]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-40.txt";
//        args[136]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-41.txt";
//        args[137]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-42.txt";
//        args[138]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-43.txt";
//        args[139]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-44.txt";
//        args[140]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-45.txt";
//        args[141]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-46.txt";
//        args[142]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-47.txt";
//        args[143]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-48.txt";
//        args[144]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-49.txt";
//        args[145]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-50.txt";
//        args[146]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-78.txt";
//        args[147]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-80.txt";
//        args[148]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle4x4-unsolvable.txt";
//        args[149]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle50.txt";

        args = new String[1];

        args[0]="C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle04.txt";

        for (String filename : args) {

            // read in the board specified in the filename
            In in = new In(filename);
            int n = in.readInt();
            int[][] tiles = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    tiles[i][j] = in.readInt();
                }
            }

            // solve the slider puzzle
            Board initial = new Board(tiles);
            Solver solver = new Solver(initial);
            StdOut.println(filename + ": " + solver.moves());
        }

//
//
//        args = new String[1];
//        //args[0] = "C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle3x3-00.txt";
//        args[0] = "C:\\Source\\coursera-algorithms\\8puzzle-testing\\8puzzle\\puzzle07.txt";
//        // write your code here
//        // create initial board from file
//        In in = new In(args[0]);
//
//        int n = in.readInt();
//        int[][] blocks = new int[n][n];
//
//        for (int i = 0; i < n; i++)
//            for (int j = 0; j < n; j++)
//                blocks[i][j] = in.readInt();
//
//        Board initial = new Board(blocks);
//        StdOut.print("Initial:");
//        StdOut.print(initial.toString());
//
//        Board twin1 = initial.twin();
//        StdOut.print("Twin:");
//        StdOut.print(twin1.toString());
//
//        Queue<Board> neighbors = (Queue<Board>) initial.neighbors();
//
////        for (Board b:neighbors) {
////            StdOut.print(b.toString());
////        }
//
//      //  StdOut.print(toString(Board.goal));
//
//        // solve the puzzle
//        Solver solver = new Solver(initial);
//
//        // print solution to standard output
//        if (!solver.isSolvable())
//            StdOut.println("No solution possible");
//        else {
//            StdOut.println("Minimum number of moves = " + solver.moves());
//            for (Board board : solver.solution())
//                StdOut.println(board);
//        }
    }
}
