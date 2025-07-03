import java.util.Scanner;
public class Reverse {
    public static String isReverse(String str){
        String result =" ";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
                return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("The String is reverse "+isReverse(name));
    }
}
