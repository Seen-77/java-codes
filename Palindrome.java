import java.util.Scanner;
public class Palindrome {

    public static boolean isPalindrome(String str){
        String result="";
         for(int i=str.length()-1;i>=0;i--)
            result+=str.charAt(i);
        
        return str.equalsIgnoreCase(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        if(isPalindrome(input))
            System.out.println("Is a palindrome");
        else
            System.out.println("Is't Palindrome");
    }
}
