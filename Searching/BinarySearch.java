package AlogirthmsJava.Searching;

public class BinarySearch {
    public static int helper(int[] a, int low, int high, int key) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;

        if (a[mid] == key)
            return mid;

        if (a[mid] > key)
            return helper(a, low, mid - 1, key);

        return helper(a, mid + 1, high, key);
    }

    public static int binaryS(int[] a, int key) {
        int low = 0, high = a.length - 1;
        return helper(a, low, high, key);
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 7, 12, 15 };
        int pos = binaryS(a, 12);
        System.out.println(pos);

    }
}
