import java.util.Scanner;
public class CheckEvenOrOdd {
    public static void CheckNumberEvenOrOdd(int num){
        if(num%2==0){
            System.out.println("The number is Even Number");
        }
        else{
            System.out.println("The number is Odd Number");
        }
    }
    // It is for range of even or odd number for  given number
    public static void rangeOfEvenOrOdd(int start, int end){
        System.out.println("even numbers in between from "+start+"and"+end+":");
        for(int i=start;i<=end;i++){
            if(i%2==0)
                System.out.print(i+" ");   
        }
        System.out.println();
        System.out.println("odd numbers in between from "+start+"and"+end+":");
        for(int i=start;i<=end;i++){
            if(i%2 !=0)
                System.out.print(i+" ");   
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        CheckNumberEvenOrOdd(num);
        System.out.println("Enter the starting range");
        int num1=sc.nextInt();
        System.out.println("Enter the Ending range");
        int num2=sc.nextInt();
        rangeOfEvenOrOdd(num1, num2);
    }
}
