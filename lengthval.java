class Solution {
    public static void main(String[] args) {
        String s="hello   world   ";
        System.out.println(s);
        int i=s.length()-1;
        while(i>=0&&s.charAt(i)==' '){
            i--;
        }
        int count=0;
        while(i>=0&&s.charAt(i)!=' '){
            count++;
            i--;
        }
    System.out.println(count);
        
        
    }
}