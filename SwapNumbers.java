import java.util.Scanner;
public class SwapNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        SwapNumbers obj= new SwapNumbers();
        System.out.println("Enter the First number");
        int number1=sc.nextInt();
        System.out.println("Enter the Second number");
        int number2=sc.nextInt();
        System.out.println("Here Before swap the"+ number1 +"and"+number2);
        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;
        System.out.println("After Swaping"+number1+"and"+number2);

    }
}
