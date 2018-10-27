public class controls {
    //
    private int GAME_SIZE = 16;

    // Keeps track of the current board state,
    // i.e., the order of the shuffled numbers
    public String[] currSize = new String[GAME_SIZE];

    // Strings for printing to console
    private String print1 = "+-------+-------+-------+-------+";
    private String print2 = "|       |       |       |       |";
    private String print3 = "|  %2s   |  %2s   |  %2s   |  %2s   |";

    public void print() {
        String row1 = String.format(print3, currSize[0], currSize[1], currSize[2], currSize[3]);
        String row2 = String.format(print3, currSize[4], currSize[5], currSize[6], currSize[7]);
        String row3 = String.format(print3, currSize[8], currSize[9], currSize[10], currSize[11]);
        String row4 = String.format(print3, currSize[12], currSize[13], currSize[14], currSize[15]);

        // First row
        System.out.println(print1);
        System.out.println(print2);
        System.out.println(row1);
        System.out.println(print2);
        System.out.println(print1);

        // Row 2
        System.out.println(print2);
        System.out.println(row2);
        System.out.println(print2);
        System.out.println(print1);

        // Row 3
        System.out.println(print2);
        System.out.println(row3);
        System.out.println(print2);
        System.out.println(print1);

        // Row 4
        System.out.println(print2);
        System.out.println(row4);
        System.out.println(print2);
        System.out.println(print1);
    }

    public void scramble() {

    }

    public boolean check() {
        // will implement later
        return false;
    }

    public void getInput() {

    }
}