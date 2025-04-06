import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of the Array");
        int size = sc.nextInt();
        int []arr = new int[size];
        // by for loop  Receives tht values
        for (int i = 0; i <size ; i++) {

            arr[i]=sc.nextInt();
        }
        System.out.println("Unsorted Array " + Arrays.toString(arr));
        bubbleSort(arr,size);
        System.out.println("sorted Array " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr,int len) {
        for (int i = 0; i < len-1; i++) {
            boolean isSwap = true;
            for (int j = 1; j < len-i; j++) {
                if(arr[j] <arr[j-1]){
                    isSwap = false;
                    swapMethod(arr,j,j-1);
                }
            }
            if(isSwap){
                return;
            }
        }
    }

    public static void swapMethod(int[] arr, int first, int second) {
        int dummy = arr[first];
        arr[first] = arr[second];
        arr[second] = dummy;
    }
}
