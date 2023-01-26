package AlogirthmsJava.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = { 2, 5, 3, 8, 0, 5, 7 };
        for (int i = 0; i < a.length - 1; i++) {
            int index = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[index])
                    index = j;
            }

            if (index != i) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
        for (int n : a)
            System.out.println(n);
    }
}
