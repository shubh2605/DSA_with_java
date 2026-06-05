package array;

public class checkPalindrome {
    public static boolean palindrome(String name){
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){

        System.out.println(palindrome("abccba"));

    }
}
