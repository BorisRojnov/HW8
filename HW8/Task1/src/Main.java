import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Развернуть массив\n");
        for(int i = 0; i < array.length/2; i++) {
             int helpSpace = array[i];
             array[i] = array[array.length - (1 + i)];
             array[array.length - (1 + i)] = helpSpace;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
