package AlogirthmsJava.Questions;

public class BuyAndSell122LC {
    public static void main(String[] args) {
        int profit = 0;
        int[] arr = {2,45,21,4,4,2,4,6,86,9};
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1])
                profit+=arr[i]-arr[i-1];
        }
        System.out.println(profit);
    }
}
