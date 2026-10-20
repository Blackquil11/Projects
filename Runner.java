public class Runner {
    // exercises the IntArray class
    public static void main(String[] args) {
        IntArray iArr = new IntArray(10);
        int leng = iArr.size();

        System.out.println("The number of array elements is: " + leng);

        iArr.fillRand();
        System.out.println("Array with 10 elements filled with random numbers between 1 and 6");
        System.out.println(iArr);

        iArr.set(5, 6789);
        System.out.println("The value of array element 5 is: " + iArr.get(5));
        System.out.println(iArr);

        iArr.clear();
        if (iArr.isEmpty()) {
            System.out.println("iArr is empty\n");
        }

        iArr = new IntArray(100);
        iArr.fillRand();

        System.out.println("Array with 100 elements filled with random numbers between 1 and 6");
        System.out.println(iArr);

        if (!iArr.isEmpty()) {
            iArr.sort();
        } else {
            System.out.println("Array is empty, nothing to sort");
        }

        System.out.println("Array after sorting\n");
        System.out.println(iArr);
    }
}
