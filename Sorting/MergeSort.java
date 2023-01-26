package AlogirthmsJava.Sorting;

public class MergeSort {
    public static void merge(int[] a, int l, int mid, int r) {
        int i = l;
        int j = mid + 1;
        int k = l;
        int[] b = new int[a.length];
        while (i <= mid && j <= r) {
            if (a[i] < a[j]) {
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }
        if (i > mid) {
            while (j <= r)
                b[k++] = a[j++];
        } else {
            while (i <= mid)
                b[k++] = a[i++];
        }
        for (k = l; k <= r; k++)
            a[k] = b[k];
    }

    public static void mergeSorting(int[] a, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            mergeSorting(a, l, mid);
            mergeSorting(a, mid + 1, r);

            merge(a, l, mid, r);
        }
    }

    public static void main(String[] args) {
        int[] a = { 4, 6, 2, 5, 9, 7, 3 };
        mergeSorting(a, 0, a.length - 1);
        for (int n : a)
            System.out.println(n);
    }
}
