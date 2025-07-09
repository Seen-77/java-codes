import java.util.*;
import java.util.stream.IntStream;
public class LargeOf3Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First 3 numbers");
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        
        // First way  
        int largest=Math.max(first, Math.max(second, third));
        System.out.println(" the large number is :"+largest);

        // Second way
        int [] numbers={first,second,third};
        Arrays.sort(numbers);
        System.out.print("The large element is :"+numbers[2]);

        // Third way
        int large=IntStream.of(first,second,third).max().getAsInt();
        System.out.println(" the large number is :"+large);

        // Forth Way
        int bigNumber=(first>second)?((first>third)?first:third):((second>third)?second:third);
        System.out.println("the large number is :"+bigNumber);
    }
    
}
