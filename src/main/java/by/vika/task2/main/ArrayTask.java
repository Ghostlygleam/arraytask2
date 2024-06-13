package by.vika.task2.main;

public class ArrayTask {
    public static void main(String[] args) {
        int[] arr = new int[]{6, -7, 7, -5};

        sortArray(arr);

        for (int num : arr) {
            System.out.println(num + "");
        }
    }

    public static void sortArray(int[] arr){
        int n = arr.length;

        for (int i = 0; i<n-1; i++){
            for (int j = 0; j <n -i -1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
