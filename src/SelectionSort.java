public class SelectionSort {

    public static void selectionSort(int[] arr) {
        selectionSort(arr, 0);
    }

    public static void selectionSort(int[] arr, int start) {
        if(start < arr.length - 1) {
            int minIndex = start;
            for(int i = minIndex; i < arr.length; i++) {
                if(arr[i] < arr[minIndex]) minIndex = i;
            }
            swapArr(arr, start, minIndex);
            selectionSort(arr, start + 1);
        }
    }

    public static void swapArr(int[] arr, int start, int minIndex) {
        int tmp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2 ,1};
        selectionSort(arr);
        for(int result : arr) {
            System.out.print(result + ", ");
        }
    }
}
