package AlogirthmsJava.Sorting;

public class HeapSorting {
    public static void heapify(int[] ar, int index, int n) {
        int largest = index;
        int l = 2 * index, r = (2 * index) + 1;
        if ((l <= n) && ar[l] > ar[largest])
            largest = l;
        if ((r <= n) && ar[r] > ar[largest])
            largest = r;

        if (largest != index) {
            int temp = ar[largest];
            ar[largest] = ar[index];
            ar[index] = temp;
            heapify(ar, largest, n);
        }
    }
    public static void buildHeaf(int[] a, int n){
        for (int i = n/2; i > 0; i--) {
            heapify(a, i, n);
        }
    }
    public static void heapSort(int[] ar, int n){
        buildHeaf(ar, n);
        for (int i = n; i > 1; i--) {
            int temp = ar[i];
            ar[i] = ar[1];
            ar[1] = temp;
            heapify(ar, 1, i-1);
        }
    }
    
    public static void print(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] ar = { 0, 50, 20, 30, 10, 60, 40 };
        heapSort(ar, 6);
        print(ar);
    }
}
