import java.util.ArrayList;
import java.util.Arrays;
class prefix {
    public static void main(String args[]){
        ArrayList<String>list=new ArrayList<>(Arrays.asList("flower","fly","floor","book","mamal"));
       
        for(int i=0;i<list.size();i++){
            if(list.get(i).contains("fl")){
                System.out.println(list.get(i));
            }
        }
        
    }
}