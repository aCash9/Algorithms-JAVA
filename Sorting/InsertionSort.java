package AlogirthmsJava.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = { 2, 4, 2, 1 };
        for (int i = 1; i < a.length; i++) {
            int temp = a[i], j;
            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
