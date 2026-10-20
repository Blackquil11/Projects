import java.util.Arrays;
import java.util.Random;

// Stores and manages a fixed-size array of integers.
// Random values are generated from 1 through 6.
public class IntArray {
    private int length;
    private int[] myArray;

    public IntArray(int l) {
        length = l;
        myArray = new int[length];
    }

    public void clear() {
        length = 0;
        myArray = new int[0];
    }

    public void fillRand() {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            myArray[i] = random.nextInt(6) + 1;
        }
    }

    public int get(int element) {
        return myArray[element];
    }

    public void set(int element, int newValue) {
        myArray[element] = newValue;
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void sort() {
        Arrays.sort(myArray);
    }

    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}
