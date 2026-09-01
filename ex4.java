import java.util.*;
class ex4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the numbers:");
        int n=sc.nextInt();
        System.out.println("enter the target:");
        int target=sc.nextInt();
        System.out.println("enter the values:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr=sc.nextInt();
        }
        int a,b;
        for(int i=0;i<arr.length;i++){
            a=arr[i];
            b=arr[i+1];
            if(a+b==target){
                System.out.println(a,b);
            }else{
                
            }
        }
           
    }
}