package algorithm;

/**
 * 冒泡排序算法
 * 将前面的数和后面的数进行比较
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,8,10,7,6,0,11};
        for (int i = arr.length-1 ; i > 0; i --){
            for (int j = 0 ; j < i ; j ++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            for (int ints : arr){
                System.out.print("'"+ints+"'");
            }
            System.out.println("\n");
        }
    }
}
