import java.util.*;
public class Fibonacci {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer Number");
        int num=sc.nextInt();
        int first=0,second=1,third;
        for(int i=0;i<=num;i++){
            // System.out.print(first+"");
            //  third=first+second;
            //  first=second;
            //  second=third;
             System.out.println(fibonacciSeries(i));
        }
    }
    public static int fibonacciSeries(int num){
        if(num<=1)    
          return num;
        return fibonacciSeries(num-1)+fibonacciSeries(num-2);
    }

    
}