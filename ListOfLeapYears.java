import java.util.*;
public class ListOfLeapYears {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the years to check for leap years:");
        int year1 =sc.nextInt();
        int year2 =sc.nextInt();
        System.out.print("The leap years are : ");
        for(int i=year1;i<=year2; i++){
            if((i % 400==0)||((i % 4==0)&&(i % 100!=0))){
                System.out.print(i + " ");
            }
        }
      System.out.println("The not leap years are : ");
        for(int i=year1;i<=year2; i++){
            if((i % 400!=0)||((i % 4!=0)&&(i % 100==0))){
                System.out.print(i + " ");
            }
        } 
    }
}
