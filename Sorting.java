
public class Sorting {
    public static void main(String[] args) {

        // int arr[] = {4,2,1,8,9};

        /* Selection Sort:----> */

        /*
         * int arr[] = {4,2,1,8,9};
         * 
         * for (int i=0; i<arr.length-1;i++){
         * int min = i;
         * for(int j=i+1;j<arr.length;j++){
         * if(arr[min]>arr[j]){
         * min = j;
         * }
         * 
         * }
         * if(min!=i){
         * int temp=arr[min];
         * arr[min]=arr[i];
         * arr[i]=temp;
         * }
         * }
         * for (int i=0; i<arr.length;i++){
         * System.out.print( arr[i] + " ");
         * }
         */

        /* Bubble Sort */

        /*
         * for(int i=0;i<arr.length-1;i++){
         * for(int j=0;j<arr.length-1-i;j++){
         * if(arr[j]>arr[j+1]){
         * int temp = arr[j+1];
         * arr[j+1]=arr[j];
         * arr[j]=temp;
         * }
         * }
         * }
         * 
         * for (int i=0; i<arr.length;i++){
         * System.out.print( arr[i] + " ");
         * }
         * 
         */

        /* Insertion Sort */

        /* 
        int arr[] = { 4, 2, 1, 8, 9, 5 };

        for (int i = 1; i <= arr.length-1; i++) {
            int min = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j]>min) {
                arr[j+1] = arr[j];
                j--;

            }

            arr[j+1] = min;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        */

    }
}
