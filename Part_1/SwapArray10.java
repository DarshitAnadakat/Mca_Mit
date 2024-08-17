import java.util.Arrays;

public class SwapArray10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(array));

        int[] newArray = swapFirstAndLast(array);
        System.out.println("Array after swapping: " + Arrays.toString(newArray));
    }

    public static int[] swapFirstAndLast(int[] array) {
        if (array.length < 2) return array;

        int[] newArray = array.clone();
        int temp = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = temp;

        return newArray;
    }
}
