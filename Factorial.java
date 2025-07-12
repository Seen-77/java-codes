import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("the factorial is"+fact);
        long result=FactorialSeries(num);
        System.out.println("The factorial of"+num+"Is the"+result);
        
        
    }
    public static long FactorialSeries(int num){
        if(num==1 || num==0)
            return 1;
        return num *FactorialSeries(num-1);
    }
    
}
