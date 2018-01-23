import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {5, 6, 7};
        int[] thirdArray = new int[firstArray.length + secondArray.length];

        createMassiv(firstArray, secondArray, thirdArray);
    }

    private static void createMassiv(int[] firstArray, int[] secondArray, int[] thirdArray) {
        int indexSecondArray = 0;
        for (int i = 0; i < thirdArray.length; i++) {
            if (i < firstArray.length) {
                thirdArray[i] = firstArray[i];
            } else {
                thirdArray[i] = secondArray[indexSecondArray];
                indexSecondArray++;
            }
        }
        System.out.println(Arrays.toString(thirdArray));
    }
}
