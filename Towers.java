public class Towers {
    private int numDiscs;

    // Constructor parameter: the number of discs to use.
    // The constructor calls a recursive method.
    public Towers(int n) {
        this.numDiscs = n;

        // Move the discs from peg 1 to peg 3 using peg 2 as temporary storage.
        this.moveDiscs(this.numDiscs, 1, 3, 2);
    }

    // Display each disc move using a recursive algorithm.
    private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
        if (num > 0) {
            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
            System.out.println("Move a disc from peg " + fromPeg + " to peg " + toPeg);
            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }
}
