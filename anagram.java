class anagram{
    public static void main(String[] args){
        String str="banana";
        String words="abanna";
        int[] val=new int[26];
        for(int i=0;i<str.length();i++){
            val[str.charAt(i)-'a']++;
            val[words.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
        while(val[i]!=0){
            System.out.println("not anagram");
        }
        }
        System.out.println(" an anagram");
    }
}