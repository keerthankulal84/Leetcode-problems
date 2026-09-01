class palindrome{
    public static void main(String[] args){

String s = "A man, a plan, a canal: Panama";

int left = 0;
int right = s.length() - 1;

while (left < right) {

    
    if (!Character.isLetterOrDigit(s.charAt(left))) {
        left++;
        continue;
    }

    
    if (!Character.isLetterOrDigit(s.charAt(right))) {
        right--;
        continue;
    }

    if (Character.toLowerCase(s.charAt(left)) !=
        Character.toLowerCase(s.charAt(right))) {

        System.out.println("Not Palindrome");
        return;
    }

    left++;
    right--;
}

System.out.println("Palindrome");
    }
}