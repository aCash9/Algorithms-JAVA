package AlogirthmsJava.Questions;

public class MooresVoting {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,1,3,3,3};
        int freq = 0, n=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(n==arr[i])
                freq++;
            else 
                freq--;
            
            if(freq==0)
                n=arr[i];
        }
        freq=0;
        for (int i = 0; i < arr.length; i++) {
            if(n==arr[i])
                freq++;
        }
        if(freq>2)
            System.out.println(true);
        else 
        System.out.println(false);
    }
}
