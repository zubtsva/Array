import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] myArray = {7, 14, 7010, -107, 5, 50, 17, -7, 960, 12, -66, 24, 47, 18};
        boolean sorted = false;
        int value;
        System.out.println(Arrays.toString(myArray));
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    sorted = false;
                    value = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = value;
                }

            }
        }
        System.out.println("Итог " + Arrays.toString(myArray));
    }
}