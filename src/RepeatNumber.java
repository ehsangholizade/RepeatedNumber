import java.util.Arrays;

public class RepeatNumber {
    public static void main(String[] args) {
        int[] number = {6, 9, 2, 8, 4, 2, 6, 3};
        findRepeated(number);

    }

    public static void findRepeated(int[] number) {
        Arrays.sort(number);
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] == number[i + 1]) {
                System.out.println(number[i]);
            }
        }
    }

}

