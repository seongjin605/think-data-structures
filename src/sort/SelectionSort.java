package sort;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        selectionSort(arr, 0);
    }

    public static void selectionSort(int[] arr, int start) {
        if(start < arr.length -1) {
            int minIndex = start;
            for(int i = start; i < arr.length; i++) {
                if(arr[i] < arr[minIndex]) minIndex = i;
            }
            swapArray(arr, start, minIndex);
            selectionSort(arr, start + 1);
        }
    }
    public static void swapArray(int[] arr, int start, int minIndex) {
        int temp = arr[start]; // 시작 위치
        arr[start] = arr[minIndex]; // 시작점에 가장 작은 인덱스 위치
        arr[minIndex] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,3,7,8,10,12,0};

        selectionSort(arr);

        for(int data: arr) {
            System.out.print(data + ", ");
        }
    }
}
