package AlogirthmsJava.Questions;

public class Rainwater {
    public static void main(String[] args) {
        int[] arr = {2,5,8,4,5,1};
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i]=Math.max(arr[i], left[i-1]);
        }

        right[n-1]=arr[n-1];
        for (int i = n-2; i > 0; i--) {
            right[i]=Math.max(arr[i], right[i+1]);
        }
        int ans = 0;
        for (int i = 0; i < right.length; i++) {
            ans+=(Math.min(left[i], right[i]))-arr[i];
        }

        System.out.println(ans);
    }
}
