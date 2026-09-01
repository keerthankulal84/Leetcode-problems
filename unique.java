import java.util.*;
class unique{
    public static void main(String[] args){
        String str="helloworldguuys";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if(map(i)>2){
              System.out.println(map);

        }
        
        System.out.println(map);
    }
}