package AlogirthmsJava.Questions;

public class BuyAndSell121LC {
    public static void main(String[] args) {
        int[] arr={3,1,4,8,7,2,5};
        int minValue = Integer.MAX_VALUE, maxProfit = -1;
        for (int i = 0; i < arr.length; i++) {
                minValue=Math.min(minValue, arr[i]);

                maxProfit=Math.max(arr[i]-minValue, maxProfit);
        }
        System.out.println(maxProfit);
    }
}
