class sliding{
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7,8};
        int c=0;
        int w=4;
        for(int i=0;i<w;i++){
            c+=arr[i];
        }
        int maxi=c;
        for(int i=1;i<=arr.length-w;i++){
            c=c-arr[i-1]+arr[i+w-1];
        
        if(maxi<c){
            maxi=c;
        }
        }
        System.out.println(maxi);
    }
}