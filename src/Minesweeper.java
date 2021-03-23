public class Minesweeper {
    private final int m;
    private final int n;
    private int minesNum;
    private boolean[][] minesLoc;
    private int[][] count;

    public Minesweeper(int m, int n, int minesNumber){
        this.m = m;
        this.n = n;
        this.minesNum = minesNumber;
        this.minesLoc = new boolean[m + 2][n + 2];
        this.count = new int[m][n];
    }
    private void placeMines () {
        while (this.minesNum > 0) {
            int mineM = (int) (Math.random() * m) + 1;
            int mineN = (int) (Math.random() * n) + 1;
            if (!this.minesLoc[mineM][mineN]) {
                this.minesLoc[mineM][mineN] = true;
                // System.out.println("mineM = " + mineM + " mineN = " + mineN);
                this.minesNum -= 1;
            }
        }
    }
    private void adjacentMinesCount () {
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (this.minesLoc[i - 1][j - 1]) {
                    this.count[i - 1][j - 1] += 1;
                }
                if (this.minesLoc[i - 1][j]) {
                    this.count[i - 1][j - 1] += 1;
                }
                if (this.minesLoc[i - 1][j + 1]) {
                    this.count[i - 1][j - 1] += 1;
                }
                if (this.minesLoc[i][j + 1]) {
                    this.count[i - 1][j - 1] += 1;
                }
                if (this.minesLoc[i + 1][j + 1]) {
                    this.count[i - 1][j - 1] += 1;
                }
                if (this.minesLoc[i + 1][j]) {
                    this.count[i - 1][j - 1] += 1;
                }
                if (this.minesLoc[i + 1][j - 1]) {
                    this.count[i - 1][j - 1] += 1;
                }
                if (this.minesLoc[i][j - 1]) {
                    this.count[i - 1][j - 1] += 1;
                }
            }
        }
    }
    public void printMinesweeperBoard () {
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                if (this.minesLoc[i + 1][j + 1]) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print(this.count[i][j] + "  ");
                }
            }
            if (i != this.m - 1) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Minesweeper minesweeper = new Minesweeper(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[1]));
        minesweeper.placeMines();
        minesweeper.adjacentMinesCount();
        minesweeper.printMinesweeperBoard();
        System.out.println();
    }
}
