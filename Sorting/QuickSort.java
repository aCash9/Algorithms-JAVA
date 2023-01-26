package AlogirthmsJava.Sorting;

public class QuickSort {

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int partition(int[] a, int l, int h) {
        int pivot = a[l];
        int i = l, j = h;
        while (i < j) {
            while (a[i] <= pivot)
                i++;
            while (a[j] > pivot)
                j--;

            if (i < j)
                swap(a, i, j);
        }
        swap(a, j, l);
        return j;
    }

    public static void quick(int[] a, int l, int h) {
        if (l < h) {
            int pivot = partition(a, l, h);
            quick(a, l, pivot - 1);
            quick(a, pivot + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] a = { 4,6,2,5,7,9,1,3};
        quick(a, 0, a.length - 1);
        for (int n : a)
            System.out.println(n);
    }
}
