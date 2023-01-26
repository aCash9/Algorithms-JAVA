package AlogirthmsJava.Searching;

public class InfiniteBinary {
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

    public static int infiniteB(int[] a, int key){
        int low = 0 , high = 1;
        while(a[high]<key){
            low = high;
            high*=2;
        }
        return helper(a, low, high, key);
    }
    public static void main(String[] args) {
        int[] a = {1,4,5,7,12,89};
        System.out.println(infiniteB(a,7));
    }
}
