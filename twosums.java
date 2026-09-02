import java.util.HashMap;
class target{
    public static void main(String[] args){
        int target=9;
        int[] arr={2,4,5,6,8};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int val=arr[i]+arr[j];
                if(val==target){
                    System.out.println(arr[i]+" "+arr[j]);
                    System.out.println(i + " " + j);
                }
                
            }
            
        }
        
    }
}