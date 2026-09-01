import java.util.Arrays;
class concating{
    public static void main(String[] args){
        int[] digits={9};
        int val=1;
        for(int i=0;i<digits.length;i++){
            if(digits[i]==digits.length){
            digits[i]=digits[i]+val;
            }
        }
        System.out.println(Arrays.toString(digits));

    }
}