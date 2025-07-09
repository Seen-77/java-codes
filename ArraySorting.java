import java.util.*;
public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        int [] arr=new int[size];
       System.out.println("Enter the elemnts of array");
       for(int i=0;i<size;i++){
        System.out.println("element"+(i+1)+":");
         arr[i]=sc.nextInt();
       }
      System.out.println("The Array Elements are :");
      for (int i : arr) {
        System.out.print(":"+i); 
      }
      Arrays.sort(arr);
       System.out.print("The Array Elements are sorted :");
      for (int i : arr) {
        System.out.print(":"+i); 
      }
    }
    
}
