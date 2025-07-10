import java.util.*;
public class LeapYear {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the year");
        int year =sc.nextInt();
        if((year % 400==0)||((year % 4==0)&&(year % 100!=0))){
            System.out.println("This year is a leap year"+year);
        }
        else{
            System.out.println("the year is not a leap year");
        }
    }
}
