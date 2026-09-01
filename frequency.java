import java.util.*;
import java.util.Arrays;
class frequency{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer>freq=new HashMap<>();
        System.out.println("enter the number:");
        int n=sc.nextInt();
        System.out.println("enter the array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        
        System.out.println(freq);
    }
}