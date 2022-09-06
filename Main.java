//input 3 integers and print the largest ad the smallest of the 3 numbers entered.
import java.util.*;
class Main {
  public static void main(String[] args) {
    int num,min,max;
    
    System.out.println("Enter Three Numbers:");
    Scanner n=new Scanner(System.in);

    System.out.println("Enter 1st Number:");
    int num1=n.nextInt();
     System.out.println("Enter 2nd Number:");
    int num2=n.nextInt();
     System.out.println("Enter 3rd Number:");
    int num3=n.nextInt();
    System.out.println("");

    int x=Math.max(num1,num2);
    x=Math.max(x,num3);

    int y=Math.min(num1,num2);
    y=Math.min(y,num3);
    
    System.out.println("Largest number is:"+x);
    System.out.println("Smallest number is:"+y);
  }
}