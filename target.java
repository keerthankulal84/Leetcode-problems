import java.util.HashMap;
class target{
    public static void main(String[] args){
        int target=9;
        int[] arr={2,4,5,6,8};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int need=target-arr[i];
            if(map.containsKey(need)){
                System.out.println(map.get(need)+" "+i);
                
            }
            map.put(arr[i],i);
        }
        
    }
}