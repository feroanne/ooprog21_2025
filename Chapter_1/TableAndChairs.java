public class TableAndChairs {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 24;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Conditions for placing 'X'

                if (i == 0 || i == 1) {
                    // First two rows: X at start and end only
                    if (j == 0 || j == cols - 1) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }

                } else if (i == 2) {
                    // 3rd row: X at start, end, and a block from pos 7 to 16 (10 X's)
                    if (j == 0 || j == cols - 1) {
                        System.out.print("X");
                    } else if (j >= 7 && j <= 16) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }

                } else if (i == 3) {
                    /* 
                      4th row: "XXXXX  X        X  XXXXX"
                      Positions:
                      0-4: X
                      5-6: space
                      7: X
                      8-15: space
                      16: X
                      17-18: space
                      19-23: X 
                    */
                    if (j >= 0 && j <= 4) {
                        System.out.print("X");
                    } else if (j == 7 || j == 16) {
                        System.out.print("X");
                    } else if (j >= 19 && j <= 23) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }

                } else {
                    /* 5th and 6th row: "X   X  X        X  X   X"
                       Positions:
                       0: X
                       1-3: space
                       4: X
                       5-6: space
                       7: X
                       8-15: space
                       16: X
                       17-18: space
                       19: X
                       20-22: space
                       23: X
                    */
                    if (j == 0 || j == 4 || j == 7 || j == 16 || j == 19 || j == 23) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}






