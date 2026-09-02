import java.util.Arrays;
class fib{
    public static void main(String[] args){
        int n=6;
        if(n<0){
            System.out.println("should greater than zero");
        }
        int[] fib=new int[6];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        System.out.println(Arrays.toString(fib));
    }
}