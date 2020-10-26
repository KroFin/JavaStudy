package algorithm;

/**
 *
 * 选择排序
 *    每一次从这堆参与比较的数据中找出最小值，
 *    拿着这个最小值和最前面的元素交换位置。
 *    选择排序比冒泡排序好在：每一次的交换位置都是有意义的
 *
 *    假设一个最小的
 *
 */

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3,1,6,2,5};
         for (int i = 0 ; i < arr.length ; i++){

             int min = i;

             for (int j = i +1 ; j < arr.length ; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
             }
             if (min != i){
                 int temp;
                 temp = arr[min];
                 arr[min] = arr[i];
                 arr[i] = temp;
             }
         }
         for (int ints : arr){
             System.out.print("'"+ints+"'");
         }
    }
}
