package AlogirthmsJava.Sorting;

public class BubbleSort {
    public static void swap(int n,int[] a){
        int temp =a[n];
        a[n]=a[n+1];
        a[n+1]=temp;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,2,1,7,9,45,3,6};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1])
                    swap(j, arr);      
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
