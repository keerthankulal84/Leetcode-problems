import java.util.*;
class counting{
    public static void main(String[] args){
        String val="hello";
        HashMap<Character,Integer> count=new HashMap<>();
        for(char i:val.toCharArray()){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        System.out.println(count);
    }
}