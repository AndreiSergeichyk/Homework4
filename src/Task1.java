import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {12, 5, 9, 44, 1, 7, 13, 21, 32, 6};

        for (int i = 0; i < array.length; i++) {
            int last = array[array.length - 1];
            shiftElements(array, last);
        }
    }

    private static void shiftElements(int[] array, int last) {
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
        System.out.println(Arrays.toString(array));
    }
}
