import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {9, 9, 2, 5, 7, 2, 3, 2, 9};

        dellDuplicate(array);
    }

    private static void dellDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
