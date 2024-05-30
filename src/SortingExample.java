import java.util.Arrays;
import java.util.Random;


public class SortingExample {

    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }



        int counter = 0;

        for (int j = 0; j < numbers.length - 1; j++) {
            boolean isChanged = false;

            for (int i = 0; i < numbers.length - 1 - j; i++) {
                counter++;
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    isChanged = true;
                }
            }
            if (!isChanged) {
                break;
            }
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println(counter);


        for (int b = 0; b < numbers.length; b++) {
            counter++;
            int min = numbers[b];
            int index = b;

            for (int i = b; i < numbers.length; i++) {
                counter++;
                if (numbers[i] < min) {
                    min = numbers[i];
                    index = i;
                }
            }
            int temp = numbers[b];
            numbers[b] = numbers[index];
            numbers[index] = temp;
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println(counter);


    }

}



