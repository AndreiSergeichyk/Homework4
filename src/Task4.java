import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[][] dvyxmernyArray = {{1, 3, 4, 5}, {1, 1}, {6}};

        System.out.println(Arrays.toString(linearize(dvyxmernyArray)));
    }

    private static int[] linearize(int[][] dvyxmernyArray) {
        int[] array = new int[getLenght(dvyxmernyArray)];
        int indexForOdnomernyArray = 0;
        for (int i = 0; i < dvyxmernyArray.length; i++) {
            for (int j = 0; j < dvyxmernyArray[i].length; j++) {
                array[indexForOdnomernyArray++] = dvyxmernyArray[i][j];
            }
        }
        return array;
    }

    private static int getLenght(int[][] dvyxmernyArray) {
        int lenght = 0;
        for (int i = 0; i < dvyxmernyArray.length; i++) {
            lenght += dvyxmernyArray[i].length;
        }
        return lenght;
    }
}
