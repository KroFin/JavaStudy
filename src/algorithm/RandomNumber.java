package algorithm;

import java.util.Random;

/**
 * 随机数生成5个不相同的数
 */

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }

        int index = 0;
        while (index < arr.length){

            int num = random.nextInt(100);
            if (!contains(arr,num)){
                arr[index] = num;
                index++;
            }
        }

        for (int value : arr) {
            System.out.println(value);
        }
    }

    private static boolean contains(int[] arr, int key){
        for (int value : arr) {
            if (value == key) {
                return true;
            }
        }
        return false;
    }
}
