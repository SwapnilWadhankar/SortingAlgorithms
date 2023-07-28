import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[] arr){
        boolean isSwapped = false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;// to verify if the array is sorted or not
                }
            }
            if(!isSwapped){
                //If the array is already sorted then no need to rerun the outer loop
                break;
            }
        }
    }
}
