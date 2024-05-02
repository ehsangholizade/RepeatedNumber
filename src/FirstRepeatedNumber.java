public class FirstRepeatedNumber {
    public static int findFirstRepeatedNumber(int[] numbers) {
        boolean[] seen = new boolean[10];

        for (int num : numbers) {
            if (seen[num]) {
                return num;
            }
            seen[num] = true;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {9, 1, 3, 6, 4, 7, 5, 2, 8, 4};

        int firstRepeatedNumber = findFirstRepeatedNumber(numbers);
        if (firstRepeatedNumber == -1) {
            System.out.println("No repeated numbers found in the list.");
        } else {
            System.out.println("The first repeated number is: " + firstRepeatedNumber);
        }
    }
}
